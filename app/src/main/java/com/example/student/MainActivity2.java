package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String s1=intent.getStringExtra("n");
        String s2=intent.getStringExtra("a");
        String se=intent.getStringExtra("em");
        String sd=intent.getStringExtra("de");
        String s3=intent.getStringExtra("pos");
        ArrayList<model> o = (ArrayList<model>) intent.getSerializableExtra("key");
        model data;
        data = (model) o.get(Integer.parseInt(s3));
        Log.i("alert","ma2"+data.name);
        frag2 s=new frag2(s1,s2,s3,se,sd,o);
        getSupportFragmentManager().beginTransaction().add(R.id.mainact2,s).commit();
    }
}