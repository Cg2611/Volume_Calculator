package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);
        shapeArrayList= new ArrayList<>();

        Shape s1= new Shape(R.drawable.sphere,"Sphere");
        Shape s2= new Shape(R.drawable.cylinder,"Cylinder");
        Shape s3= new Shape(R.drawable.cube,"Cube");
        Shape s4= new Shape(R.drawable.prism,"Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter=new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


    }
}