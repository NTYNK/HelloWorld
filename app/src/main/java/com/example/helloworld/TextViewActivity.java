package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4 = findViewById(R.id.tv_4);
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//设置中划线
        mtv4.getPaint().setAntiAlias(true);//去锯齿
    }
}
