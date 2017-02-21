package com.example.liushiqian.jsontese;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.example.liushiqian.jsontese.Entity.NewBook;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.book_summary)
    TextView book_summary;
    @BindView(R.id.book_title)
    TextView book_title;
    String responseJson;
    Book book;
    static final String url = "https://api.douban.com/v2/book/1220562";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        textView = (TextView) findViewById(R.id.text_show);


        TestJson testJson = new TestJson("libra", 20, 1);
        final String json = JSON.toJSONString(testJson);

        new Thread() {
            @Override
            public void run() {
                getJson(url);
            }
        }.start();
        parseJson(responseJson);
        if (book != null)
        {
            book_summary.setText("书籍简介：" + book.getSummary());
            book_title.setText(book.getTitle());
        }
    }


    private void getJson(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i("=====", "request failed");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                responseJson = response.body().string();
                if (null != responseJson) {
                    Log.i("====", responseJson);
                    parseJson(responseJson);
                }
            }
        });
    }

    private void parseJson(String json) {
        book = JSON.parseObject(json, Book.class);
        if (null == book) {
            Log.i("====1", "book is null");
        }
    }
}
