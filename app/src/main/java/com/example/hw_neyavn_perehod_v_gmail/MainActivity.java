package com.example.hw_neyavn_perehod_v_gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomappbar.BottomAppBar;


public class MainActivity extends AppCompatActivity {
private EditText gmail;
private EditText themes;
private EditText text;
private Button btn_send;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gmail =findViewById(R.id.gmail);
        themes =findViewById(R.id.themes);
        text =findViewById(R.id.text);
        btn_send = findViewById(R.id.btn_send);
btn_send.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL , gmail.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT , themes.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT , text.getText().toString());
        startActivity(intent);
    }
});

//      Button btn_send = findViewById(R.id.btn_send);
//      btn_send.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              sendMail();
//          }
//          private void sendMail
//
//      });


    }
}