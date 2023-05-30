package com.example.application.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.application.R;

public class ViewHolder extends AppCompatActivity {
    ImageView img,img7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_viewholder);


        img=findViewById(R.id.pic);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ViewHolder.this,DetailActivity.class);
            }
        });

        img7=findViewById(R.id.imageView7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ViewHolder.this,DetailActivity.class);
            }
        });



    }
}
