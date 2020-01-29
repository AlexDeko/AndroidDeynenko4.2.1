package com.homework1_3.androiddeynenko421new.adapters;

import android.content.Context;
import android.media.Image;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.homework1_3.androiddeynenko421new.Notice;
import com.homework1_3.androiddeynenko421new.R;

import java.util.List;

public class NoticeAdeter extends BaseAdapter {
    private List<Notice> listNotes;
    private LayoutInflater inflater;

    public NoticeAdeter(List<Notice> listNotes, Context context) {
        this.listNotes = listNotes;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listNotes != null ? listNotes.size() : 0;
    }

    @Override
    public Notice getItem(int position) {
        return listNotes != null ? listNotes.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final  View currentView;

        if(convertView != null){
            currentView = convertView;
        } else {
            currentView = inflater.inflate(R.layout.item_list_view, parent, false);
        }

        Notice notice = getItem(position);
        if(notice != null){
            TextView tittleView = currentView.findViewById(R.id.title);
            TextView subtittleView = currentView.findViewById(R.id.subTittle);
            CheckBox checkBoxView = currentView.findViewById(R.id.checkBox);
            ImageView imageView = currentView.findViewById(R.id.imageView);

            tittleView.setText(notice.getTittle());
            subtittleView.setText(notice.getSubtittle());
        }
        return currentView;
    }
}
