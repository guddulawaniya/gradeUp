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

public class cardviewadapter extends RecyclerView.Adapter<cardviewadapter.viewholde> {

    ArrayList<cardmodel> list;

    public cardviewadapter(ArrayList<cardmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public viewholde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view_sample,parent,false);
        return new viewholde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholde holder, int position) {
        cardmodel card = list.get(position);
        holder.image.setImageResource(card.getImage());
        holder.coursename.setText(card.getCorsename());
        holder.title.setText(card.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholde extends RecyclerView.ViewHolder {
        TextView coursename ,title;
        ImageView image;
        public viewholde(@NonNull View itemView) {
            super(itemView);
            coursename = itemView.findViewById(R.id.coursename);
            title = itemView.findViewById(R.id.coursetitle);
            image = itemView.findViewById(R.id.courseicon);
        }
    }
}
