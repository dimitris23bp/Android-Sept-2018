package com.example.september18;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ArticleFragment extends Fragment {

    public ArticleFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        NewsAdapter newsAdapter = new NewsAdapter(getContext(), new ArrayList<Article>());

        ListView articlesList = rootView.findViewById(R.id.listView);
        articlesList.setAdapter(newsAdapter);
        FetchNewsTask task = new FetchNewsTask(newsAdapter);
        task.execute();



        return rootView;
    }

}
