package com.example.axasd;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String courseList[]={"java","c++","pyhton","maths","js"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        simplelist=(ListView) findViewById(R.id.simplelistView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.list_view,R.id.b123,courseList);
        simplelist.setAdapter(arrayAdapter);

    }
}