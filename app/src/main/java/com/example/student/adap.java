package com.example.student;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class adap extends RecyclerView.Adapter<adap.myviewholder> {
    List dataholder;
String str1,str2,mr,me,md;
TextView t1;
    public adap(List dataholder) {
        this.dataholder = dataholder;
    }
    public adap(List dataholder,String s1,String s2,String mr,String me,String md) {
        this.dataholder = dataholder;
        this.str1=s1;
        this.str2=s2;
        this.mr=mr;
        this.me=me;
        this.md=md;
        Log.i("alert","insise cons"+str2+str1);
    }
    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return  new myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        if(str2 == null){
            Log.i("alert","insise if"+str2+str1);
        model data= (model) dataholder.get(position);
        holder.name.setText(data.name);
        holder.roll.setText(String.valueOf(data.roll));
            holder.ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), MainActivity2.class);
                    intent.putExtra("a",String.valueOf(data.roll));
                    intent.putExtra("n",data.name);
                    intent.putExtra("em",data.e);
                    intent.putExtra("de",data.d);
                    intent.putExtra("pos",String.valueOf(position));
                    Log.i("alert","oneeee"+((model) dataholder.get(position)).name);
                    intent.putExtra("key", (Serializable) dataholder);
                    view.getContext().startActivity(intent);
                }
            });
        }
        else{
            int p=Integer.parseInt(str2);
            if(position == p){
            model data= (model) dataholder.get(p);
            if(str1 == null){
                str1=data.name;
            }
                if(me == null){
                    me=data.e;
                }
                if(mr == null){
                    mr=String.valueOf(data.roll);
                }
                if(md == null){
                    md=data.d;
                }
            data.name=str1;
            holder.name.setText(str1);
            holder.roll.setText(mr);
            Log.i("alert","Inside else of adap"+p);
            holder.ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), MainActivity2.class);
                    intent.putExtra("a",mr);
                    intent.putExtra("n",str1);
                    intent.putExtra("em",me);
                    intent.putExtra("de",md);
                    intent.putExtra("pos",String.valueOf(position));
                    Log.i("alert","twoooo"+((model) dataholder.get(position)).name);
                    intent.putExtra("key", (Serializable) dataholder);
                    view.getContext().startActivity(intent);
                }
            });
        }else{
                model data= (model) dataholder.get(position);
                holder.name.setText(data.name);
                holder.roll.setText(String.valueOf(data.roll));
                Log.i("alert","Inside else of adap"+p);
                holder.ll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), MainActivity2.class);
                        intent.putExtra("a",String.valueOf(data.roll));
                        intent.putExtra("n",data.name);
                        intent.putExtra("em",data.e);
                        intent.putExtra("de",data.d);
                        intent.putExtra("pos",String.valueOf(position));
                        Log.i("alert","threeee"+((model) dataholder.get(position)).name);
                        intent.putExtra("key", (Serializable) dataholder);
                        view.getContext().startActivity(intent);
                    }
                });
            }
        }
        }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView name,roll;
        public LinearLayout ll;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            roll=itemView.findViewById(R.id.age);
            t1=itemView.findViewById(R.id.n1);
            ll = (LinearLayout)itemView.findViewById(R.id.sr);
        }
    }
}
