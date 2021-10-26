package com.example.cognitive.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cognitive.R;

public class FRAIL_intropage extends AppCompatActivity {

    private Button back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frail_intropage);
    }


    public void startActivityForResult(View view)
    {
        finish();
    }

    public void startFrailTest(View view)
    {
        Intent intent=new Intent(FRAIL_intropage.this,FRAIL_test.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_top,R.anim.slide_to_bottom);
    }
}