package com.example.gradeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Profile_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView otherexamrecyclerview;
    ImageView profileimage;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView menu = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.examcategoryrecyclerview);
        otherexamrecyclerview = findViewById(R.id.otherexamrecyclerview);
        profileimage = findViewById(R.id.profileimage);
        drawerLayout = findViewById(R.id.drawer);

        profileimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        // your exam category recyclerview
        ArrayList<cardmodel> list = new ArrayList<>();
        recyclerView.setLayoutManager(new GridLayoutManager(this,1 , GridLayoutManager.VERTICAL,false));
        examcategoryadapter adapter = new examcategoryadapter(this,list);
        recyclerView.setAdapter(adapter);


        // other exam recycler view

        otherexamrecyclerview.setLayoutManager(new GridLayoutManager(this,2 , GridLayoutManager.VERTICAL,false));
        otherexamadapter otherexamadapter = new otherexamadapter(list,this);
        otherexamrecyclerview.setAdapter(otherexamadapter);


        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}