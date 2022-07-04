package com.example.gradeup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class otherexamadapter extends RecyclerView.Adapter<otherexamadapter.viewholder> {

    ArrayList<cardmodel> list;
    Context context;

    public otherexamadapter(ArrayList<cardmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.otherexamview_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        cardmodel model = list.get(position);
        holder.image.setImageResource(model.getImage());
        holder.coursename.setText(model.getCorsename());
        holder.title.setText(model.getTitle());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView coursename ,title;
        ImageView image;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            coursename = itemView.findViewById(R.id.othercoursename);
            title = itemView.findViewById(R.id.othercoursetitle);
            image = itemView.findViewById(R.id.othercourseicon);
        }
    }
}
