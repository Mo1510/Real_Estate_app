package com.example.application.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.application.Adapter.ItemsAdapter;
import com.example.application.Domain.ItemsDomain;
import com.example.application.R;

import java.util.ArrayList;
//Create public class for MainActivity
public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPopular,adapterNew;
private RecyclerView recyclerViewPopular,recyclerViewNew;
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inirRecyclerView();
    }

    private void inirRecyclerView() {
        ArrayList<ItemsDomain>  ItemsArraylist=new ArrayList<>();
        //Make array for display the title and description
        ItemsArraylist.add(new ItemsDomain("House with great view","alseeb CA 90905", "This 2 bed /1 bath home boastsman enrmous, open living paln, accented by striking\n architectural features and high-end finishes\n Feelinspired by open sight lines that\n embrance the outdoors, crowned by stunning\n coffee ceilings.",2,1,10500,"pic1",true));


        ItemsArraylist.add(new ItemsDomain("House with great view","alseeb CA 90905", "This 2 bed /1 bath home boastsman enrmous, open living paln, accented by striking\n architectural features and high-end finishes\n Feelinspired by open sight lines that\n embrance the outdoors, crowned by stunning\n coffee ceilings.",3,1,12000,"pic2",false));

        ItemsArraylist.add(new ItemsDomain("House with great view","alseeb CA 90905", "This 2 bed /1 bath home boastsman enrmous, open living paln, accented by striking\n architectural features and high-end finishes\n Feelinspired by open sight lines that\n embrance the outdoors, crowned by stunning\n coffee ceilings.",3,1,10500,"pic1",true));

        recyclerViewPopular=findViewById(R.id.viewPupolar);
        recyclerViewNew=findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        adapterNew=new ItemsAdapter(ItemsArraylist);
        adapterPopular=new ItemsAdapter(ItemsArraylist);


        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}