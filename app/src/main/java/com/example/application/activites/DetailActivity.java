package com.example.application.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.application.Domain.ItemsDomain;
import com.example.application.R;

import java.text.DecimalFormat;

public class DetailActivity extends AppCompatActivity {
    //Call the txt to be show
private TextView titleTxt,addressTxt,bedTxt,bathTxt,wifiTxt,descriptionTxt,priceTxt;
private ItemsDomain item;
private ImageView pic;

DecimalFormat formatter=new DecimalFormat("###,###,###,##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

    }

}