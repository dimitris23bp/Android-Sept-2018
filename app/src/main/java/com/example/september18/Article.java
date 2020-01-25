package com.example.september18;

public class Article {

    private String title;
    private String sourceName;
    private String description;
    private String url;

    public Article() {}

    public Article(String title, String sourceName, String description, String url) {
        this.title = title;
        this.sourceName = sourceName;
        this.description = description;
        this.url = url;
    }

    public String toString(){
        return title +" - "+ description +" - "+ url;
    }

    public String getTitle() {
        return title;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
