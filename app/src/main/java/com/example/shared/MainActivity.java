package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weight,lenght,chronicdisease,age;
    Button save;
    SharedPreferences sp;
    String weightst,lenghtst,chronicdiseasest,agest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=findViewById(R.id.edit_weight);
        lenght=findViewById(R.id.edit_Length);
        chronicdisease=findViewById(R.id.edit_chronicdisease);
        age=findViewById(R.id.edit_age);
        save=findViewById(R.id.save);
        sp=getSharedPreferences("myPatient", Context.MODE_PRIVATE);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 weightst=weight.getText().toString();
              lenghtst=lenght.getText().toString();
                 chronicdiseasest=chronicdisease.getText().toString();
                 agest=age.getText().toString();
SharedPreferences.Editor editor=sp.edit();
editor.putString("weight",weightst);
editor.putString("lenght",lenghtst);
editor.putString("chronic disease",chronicdiseasest);
editor.putString("age",agest);
editor.commit();
                Toast.makeText(MainActivity.this,"Information Saved",Toast.LENGTH_LONG).show();
                


            }
        });
    }
}
