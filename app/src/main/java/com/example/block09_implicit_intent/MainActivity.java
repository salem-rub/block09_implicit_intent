package com.example.block09_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendIntent (View view) {
        String text = ((EditText) findViewById(R.id.msgtext)).getText().toString();
        Toast.makeText(this,"this is your msg: " + text,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: 0780372353"));
        intent.putExtra("sms_body", text);
        startActivity(intent);
    }
}