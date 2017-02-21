package com.example.liushiqian.jsontese;

import java.util.ArrayList;

/**
 * Created on  2017/2/20.
 * Author: LiuShiQian
 * Description: XXX
 */
public class Book {
    private String id;
    //出版社
    private String publisher;
    //书名
    private String title;
    //alt
    private String alt;
    //url
    private String url;
    //简介
    private String summary;
    //价格
    private String price;
    //页码
    private int pages;
    //封面图片
    private String image;
    //出版日期
    private String pubdate;

    //评分
    private Rating rating = new Rating();
    //标签
    private ArrayList<Tag> tags = new ArrayList<Tag>();
    //作者
    private ArrayList<String> author = new ArrayList<String>();
    //译者
    private ArrayList<String> translator = new ArrayList<String>();
    //图片
    private Images images = new Images();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getTranslator() {
        return translator;
    }

    public void setTranslator(ArrayList<String> translator) {
        this.translator = translator;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
