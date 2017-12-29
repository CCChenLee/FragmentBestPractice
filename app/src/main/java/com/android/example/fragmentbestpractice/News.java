package com.android.example.fragmentbestpractice;

/**
 * Created by 果粒橙 on 2017.12.19.
 * 新闻的实体类：title字段表示新闻标题，content字段表示新闻内容
 * 自动生成get和set：鼠标右键Generate（Alt+Insert）
 */

public class News {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
