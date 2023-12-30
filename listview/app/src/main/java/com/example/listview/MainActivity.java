package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Button btn1, btn2;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.ls1);
        btn1=(Button) findViewById(R.id.butAdd);
        btn2=(Button) findViewById(R.id.butDel);
        edt=(EditText) findViewById(R.id.mondk);
        ArrayList<String> monhoc = new ArrayList<>();
        monhoc.add("   Math");
        monhoc.add("   Science");
        monhoc.add("    History");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, monhoc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // i trả về vị trí click trên list view
                Toast.makeText(MainActivity.this,monhoc.get(position),Toast.LENGTH_SHORT).show();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=edt.getText().toString();
                monhoc.add(str);
                adapter.notifyDataSetChanged();
            }
        });

    }
}