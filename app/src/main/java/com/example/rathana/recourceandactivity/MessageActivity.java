package com.example.rathana.recourceandactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    private EditText tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tvMessage=findViewById(R.id.tvMessage);

    }

    public void onSendClickListener(View view) {
        String sms=tvMessage.getText().toString();
        Intent intent=new Intent(MessageActivity.this,DetailActivity.class);
        intent.putExtra("DATA",sms);
        startActivity(intent);
    }
}
