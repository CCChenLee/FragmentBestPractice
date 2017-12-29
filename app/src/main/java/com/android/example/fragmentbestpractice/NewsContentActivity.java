package com.android.example.fragmentbestpractice;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.android.example.fragmentbestpractice.R.id.news_content_fragment;

public class NewsContentActivity extends AppCompatActivity {

    //    启动NewsContentActivity需要传递两个重要的字符串参数，为了方便了解则自己添加该方法
//    所需要的数据在参数中全部体现出来了
    public static void actionStart(Context context, String newsTitle, String newsContent) {
        Intent intent = new Intent(context, NewsContentActivity.class);
        intent.putExtra("news_title", newsTitle);
        intent.putExtra("news_content", newsContent);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);
        //获取传入的新闻标题
        String newsTitle = getIntent().getStringExtra("news_title");
        //获取传入的新闻内容
        String newsContent = getIntent().getStringExtra("news_content");
        NewsContentFragment newsContentFragment = (NewsContentFragment)
                getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(newsTitle, newsContent);//刷新界面
    }
}
