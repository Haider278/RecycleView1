package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<person> personList;
    RecyclerView personRecycler;
    PersonRecyclerAdapter personRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personRecycler=findViewById(R.id.personRecycleView);
        personRecycler.setHasFixedSize(true);
        setData();
        personRecyclerAdapter=new PersonRecyclerAdapter(personList,this);
        personRecycler.setAdapter(personRecyclerAdapter);
    }

    private void setData() {
        personList=new ArrayList<>();
        personList.add(new person(1,"Good","faster",R.drawable.img));
        personList.add(new person(2,"book","football",R.drawable.img_1));
        personList.add(new person(3,"jack","love rose",R.drawable.img_2));
        personList.add(new person(4,"son","stored ",R.drawable.img_3));
    }
}