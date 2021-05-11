package com.max.newrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.max.newrecycleview.Adapter.RecycleviewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> mydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mydata = new ArrayList<>();
        mydata.add("c");
        mydata.add("c++");
        mydata.add("c#");
        mydata.add("scala");
        mydata.add("java");
        mydata.add("dart");
        mydata.add("r");
        mydata.add("rubi");
        mydata.add("html");
        mydata.add("css");
        recyclerView.setAdapter(new RecycleviewAdapter(mydata));
    }
}