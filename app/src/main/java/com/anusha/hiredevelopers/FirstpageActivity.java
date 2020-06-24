package com.anusha.hiredevelopers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstpageActivity extends AppCompatActivity {
ImageView img1;
    TextView txt1, txt2;
    Button btnyes, btnno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        img1 = findViewById(R.id.hiredev);
        txt1 = findViewById(R.id.title);
        txt2 = findViewById(R.id.des);
        btnyes = findViewById(R.id.btnyes);
        btnno = findViewById(R.id.btnno);

        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstpageActivity.this, MainActivity.class));
            }
        });

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstpageActivity.this,LoginActivity.class));
            }
        });
    }
}
