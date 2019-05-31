package com.example.pickrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Contents extends AppCompatActivity {
    private TextView tvTitle, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        tvTitle  = (TextView) findViewById(R.id.cTitle);
        tvdescription = (TextView) findViewById(R.id.cDescription);
        img = (ImageView) findViewById(R.id.kFoodTopImg);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        int image = intent.getExtras().getInt("ListThumbnail");

        tvTitle.setText(Title);
        img.setImageResource(image);
    }
}
