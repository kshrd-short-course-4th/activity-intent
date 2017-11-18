package com.example.rathana.recourceandactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);

        tvDetail=findViewById(R.id.tvDetail);
        Intent intent =getIntent();
        String sms="";
        if(null!=intent){
            sms=intent.getStringExtra("DATA");
        }
        tvDetail.setText(sms);
    }
}
