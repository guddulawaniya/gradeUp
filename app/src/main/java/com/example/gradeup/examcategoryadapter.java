package com.example.gradeup;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class examcategoryadapter extends RecyclerView.Adapter<examcategoryadapter.viewholder> {

    Context context;
    ArrayList<cardmodel> list;

    public examcategoryadapter(Context context, ArrayList<cardmodel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mainrecyclerview,parent,false);
        return  new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        cardmodel model = list.get(position);
        holder.image.setImageResource(model.getImage());
        holder.examname.setText(model.getCorsename());
        holder.title.setText(model.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,mock_test_activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView image ;
        TextView examname,title;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.examimageicon);
            examname = itemView.findViewById(R.id.examname);
            title = itemView.findViewById(R.id.examtitle);
        }
    }
}
