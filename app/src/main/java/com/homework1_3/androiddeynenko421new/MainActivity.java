package com.homework1_3.androiddeynenko421new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.homework1_3.androiddeynenko421new.adapters.NoticeAdeter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        List<Notice> arrayList = new ArrayList<>();
        arrayList.add(new Notice("TopExample",
                "help people", R.drawable.ic_launcher_foreground,
                true));
        arrayList.add(new Notice("TopHelp",
                "let it snow let it snow let it snow",
                R.drawable.ic_launcher_foreground, true));
        arrayList.add(new Notice("Fast",
                "ReadySteadyGo", R.drawable.ic_launcher_foreground,
                true));

        NoticeAdeter noticeAdeter = new NoticeAdeter(arrayList, this);

        listView.setAdapter(noticeAdeter);
    }

}
