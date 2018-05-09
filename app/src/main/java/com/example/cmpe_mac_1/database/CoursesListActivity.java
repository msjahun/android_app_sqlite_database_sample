package com.example.cmpe_mac_1.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    ListView listall;
    ArrayAdapter<String> adapter;
     ArrayList<student> studentsList= new ArrayList<>();
    ArrayList<String> array = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        Bundle bundle = getIntent().getExtras();
            ArrayList<student> studentsList= (ArrayList<student>)bundle.getStringArrayList("StudentsList");


        listall=(ListView)findViewById(R.id.listView);
        
        for(student stu : studentsList){
         array.add(stu.getStudentNumber()+" "+getStudentGrade());   
            
        }

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listall.setAdapter(adapter);


    }
}
