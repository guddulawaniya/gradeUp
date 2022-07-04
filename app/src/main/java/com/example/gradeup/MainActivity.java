package com.example.gradeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<cardmodel> list;
    RecyclerView recyclerView;
    cardviewadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));
        list.add(new cardmodel("Bank & Insurance", "IBPS PO , RBI Assistant, SBI SO, NA", R.drawable.ic_baseline_account_balance_24));

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayout = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayout);
        adapter = new cardviewadapter(list, this);
        recyclerView.setAdapter(adapter);
    }
}