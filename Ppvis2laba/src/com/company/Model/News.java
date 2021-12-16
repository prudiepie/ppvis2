package com.company.Model;

import java.util.ArrayList;

public class News {
    ArrayList<New> articles = new ArrayList<>();

    public void setArticles(ArrayList<New> articles) {
        this.articles = articles;
    }

    public ArrayList<New> getArticles() {
        return articles;
    }
}
