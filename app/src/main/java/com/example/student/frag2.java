package com.example.student;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frag2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frag2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String s3,se,sd;
    public frag2() {
        // Required empty public constructor
    }
    List dataholder;
    public frag2(String mParam1, String mParam2, String s3,String se, String sd,List dataholder) {
        this.mParam1 = mParam1;
        this.mParam2 = mParam2;
        this.s3=s3;
        this.sd=sd;
        this.se=se;
        this.dataholder = dataholder;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frag2.
     */
    // TODO: Rename and change types and number of parameters
    public static frag2 newInstance(String param1, String param2) {
        frag2 fragment = new frag2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    String s1=mParam1;
    String s11=mParam2;
    String s21=sd;
    String s31=se;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        TextView t1,t2,t3,t4;
        View v= inflater.inflate(R.layout.fragment_frag2, container, false);
        t1=v.findViewById(R.id.n1);
        t2=v.findViewById(R.id.a1);
        t3=v.findViewById(R.id.e1);
        t4=v.findViewById(R.id.d1);
        t1.setText(mParam1);
        t2.setText(mParam2);
        t3.setText(se);
        t4.setText(sd);
        Button b1=v.findViewById(R.id.button1);
        t1.addTextChangedListener(new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s1=t1.getText().toString();
                Log.i("alert",s1+s3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        t2.addTextChangedListener(new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s11=t2.getText().toString();
                Log.i("alert",s1+s3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        t3.addTextChangedListener(new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s21=t3.getText().toString();
                Log.i("alert",s1+s3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        t4.addTextChangedListener(new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s31=t4.getText().toString();
                Log.i("alert",s1+s3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Updating", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("chngn", s1);
                intent.putExtra("chngr", s11);
                intent.putExtra("chnge", s21);
                intent.putExtra("chngd", s31);
                intent.putExtra("p",s3);
                model data;
                data = (model) dataholder.get(Integer.parseInt(s3));
                if(s1!=null){
                ((model) dataholder.get(Integer.parseInt(s3))).name=s1;}
                if(s11!=null){
                    ((model) dataholder.get(Integer.parseInt(s3))).roll=Integer.parseInt(s11);}
                if(s21!=null){
                    ((model) dataholder.get(Integer.parseInt(s3))).e=s21;}
                if(s31!=null){
                    ((model) dataholder.get(Integer.parseInt(s3))).d=s31;}
                Log.i("alert","frag2"+((model)dataholder.get(Integer.parseInt(s3))).name);
                intent.putExtra("key", (Serializable) dataholder);
                startActivity(intent);
            }
        });
        return v;
    }

}