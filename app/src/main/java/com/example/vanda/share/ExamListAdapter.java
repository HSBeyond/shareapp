package com.example.vanda.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ExamListAdapter extends ArrayAdapter {

    private int resource_id;

    public ExamListAdapter(Context context, int textViewResourceId, List<ExamList> objects) {
        super(context, textViewResourceId, objects);
        resource_id = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ExamListAdapter examListAdapter = (ExamListAdapter) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resource_id, parent, false);
        ImageView imageView = view.findViewById(R.id.imageView);

        TextView textView = view.findViewById(R.id.textView);

        imageView.setImageResource(ExamList.getImage_id());

        textView.setText(ExamList.getName());


        return view;

    }
}