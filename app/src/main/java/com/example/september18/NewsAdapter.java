package com.example.september18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<Article> {

    private ArrayList<Article> articles;
    private Context context;

    public NewsAdapter(Context context, ArrayList<Article> objects) {
        super(context, 0, objects);

        this.articles = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        ViewHolder viewHolder;

        Article article = articles.get(position);


        if(rowView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            rowView = inflater.inflate(R.layout.list_item_article, parent, false);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)rowView.getTag();
        }

        viewHolder.title.setText(article.getTitle());
        viewHolder.sourceName.setText(article.getSourceName());
        viewHolder.description.setText(article.getDescription());

        return  rowView;

    }
    private class ViewHolder {
        final TextView title;
        final TextView sourceName;
        final TextView description;

        ViewHolder(View view){
            title= view.findViewById(R.id.title);
            sourceName = view.findViewById(R.id.sourceName);
            description = view.findViewById(R.id.description);
        }
    }


}

