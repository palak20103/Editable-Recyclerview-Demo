package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        studata s;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String s1=intent.getStringExtra("chngn");
        String s3=intent.getStringExtra("chngr");
        String s4=intent.getStringExtra("chnge");
        String s5=intent.getStringExtra("chngd");
        String s2=intent.getStringExtra("p");
        Log.i("alert","main activity 1"+s1+ " "+s2);
        if(s2 == null){
             s=new studata();
        }else{
            ArrayList<model> o = (ArrayList<model>) intent.getSerializableExtra("key");
            model data;
            data = (model) o.get(Integer.parseInt(s2));
            Log.i("alert","ma1"+data.name);
        s=new studata(s1,s2,s3,s4,s5,o);}
        getSupportFragmentManager().beginTransaction().add(R.id.mainact,s).commit();
    }
}