package com.example.student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link studata#newInstance} factory method to
 * create an instance of this fragment.
 */
public class studata extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String Param1;
    private String Param2;
    private String mr;
    private String me;
    private String md;
    RecyclerView rv;
    ArrayList<model> dataholder;

    public studata() {
        // Required empty public constructor
    }
    public studata(String mParam1, String mParam2, String mr, String me, String md,ArrayList<model> dataholder){
        this.Param1=mParam1;
        this.Param2=mParam2;
        this.mr=mr;
        this.me=me;
        this.md=md;
        this.dataholder=dataholder;
}
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment studata.
     */
    // TODO: Rename and change types and number of parameters
    public static studata newInstance(String param1, String param2) {
        studata fragment = new studata();
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
adap a;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_studata, container, false);
        rv=v.findViewById(R.id.re);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        if(Param2 == null){
        dataholder=new ArrayList<>();
        model data=new model("Palak Tiwari",103,"palak103@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Arpita Tiwari",120,"arpita120@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ekta Singh",10,"ekta10@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ayush Tripathi",228,"ayush228@gmail.com","ECE");
        dataholder.add(data);
        data=new model("Ashu Dubey",15,"ashu15@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Anshita Jain",19,"anshita19@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Jhanvi Ghai",52,"jhanvi52@gmail.com","ECE");
        dataholder.add(data);
        data=new model("Sunny Singh",130,"sunny130@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Sanskar Gupta",38,"sanskar138@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ansh Soni",48,"ansh48@gmail.com","CB");
        dataholder.add(data);
        data=new model("Priya Tiwari",13,"priya13@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ankita Tiwari",100,"ankita100@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ritu Singh",180,"ritu180@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ayushi Tripathi",22,"ayushi22@gmail.com","ECE");
        dataholder.add(data);
        data=new model("Amit Jain",115,"amit115@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Kavita Jain",119,"kavita119@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Sanskriti Ghai",152,"sanskriti152@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Lucky Lahori",140,"lucky140@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Kanishk Gupta",68,"kanishk68@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Anjali Soni",148,"anjali148@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Pooja Tiwari",153,"pooja153@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Amisha Rai",160,"amisha160@gmail.com","CB");
        dataholder.add(data);
        data=new model("Lovely Singh",170,"lovely170@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Nikhil Tripathi",128,"nikhil128@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Nitin Tiwari",28,"nitin28@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Monty Rai",119,"monty119@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Mahi Singh",252,"mahi252@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Ani Chowksey",134,"ani134@gmail.com","ECE");
        dataholder.add(data);
        data=new model("Kush Gupta",36,"kush36@gmail.com","CSE");
        dataholder.add(data);
        data=new model("Love Soni",48,"love48@gmail.com","CSE");
        dataholder.add(data);

        a=new adap(dataholder);
        rv.setAdapter(a);}
        else{
            Log.i("alert",dataholder.get(Integer.parseInt(Param2)).name);
            if(Param1!=null){
                dataholder.get(Integer.parseInt(Param2)).name=Param1;
            }
            Log.i("alert",dataholder.get(Integer.parseInt(Param2)).name);
            a=new adap(dataholder,Param1,Param2,mr,me,md);
            rv.setAdapter(a);
        }

        return v;
    }
    public void onResume() {

        if (a != null) {
            a.notifyDataSetChanged();
        }
        super.onResume();
    }
}