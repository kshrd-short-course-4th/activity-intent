package com.example.rathana.recourceandactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tvMessage;
    private Button btnSend;

    public void onClickListener(View view){
        Intent intent =new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage= (EditText) findViewById(R.id.tvSms);
        btnSend=findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               implicitIntent();
            }
        });
        Log.e("oncreate-> ","onCreate executed");
    }

    public void implicitIntent(){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String sms=tvMessage.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,sms);
       if (null!= intent.resolveActivity(getPackageManager())){
            startActivity(intent);
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart-> ","onCreate executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume-> ","onCreate executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause-> ","onCreate executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop-> ","onCreate executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart-> ","onCreate executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy-> ","onCreate executed");
    }

    public void onDialClickListener(View view) {
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:012812812"));
        startActivity(intent);
    }
}
