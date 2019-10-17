package com.example.personalresume.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.example.personalresume.R;
import com.example.personalresume.fragments.EducationFragment;
import com.example.personalresume.model.Education;


import java.util.ArrayList;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.MyViewHolder> {

    EducationFragment frag;
    ArrayList<Education> data;
    LayoutInflater inflater;

    public EducationAdapter(EducationFragment frag, ArrayList<Education> data) {
        this.frag=frag;
        this.data=data;
        inflater= LayoutInflater.from(frag.getContext());
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position){
        View view= inflater.inflate(R.layout.fragment_blank_fragment2,parent,false);
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position){
        Education e= data.get(position);
        myViewHolder.imageView1.setImageResource(e.imageId);
        myViewHolder.textview1.setText(e.edu[0]);
        myViewHolder.textview2.setText(e.edu[1]);
        myViewHolder.textview3.setText(e.edu[2]);
        myViewHolder.textview4.setText(e.edu[3]);

    }
    @Override
    public int getItemCount(){
        System.out.print(data.size());
        return data.size();
    }


    class MyViewHolder extends ViewHolder{

        ImageView imageView1;
        TextView textview1;
        TextView textview2;
        TextView textview3;
        TextView textview4;

        public MyViewHolder(View itemview)
        {
            super(itemview);
            imageView1=(ImageView) itemview.findViewById(R.id.imageView2);
            textview1= (TextView) itemview.findViewById(R.id.tv1);
            textview2= (TextView) itemview.findViewById(R.id.tv2);
            textview3= (TextView) itemview.findViewById(R.id.tv3);
            textview4= (TextView) itemview.findViewById(R.id.tv4);
        }
    }
}
