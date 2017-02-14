package com.scriptingsystems.newactivityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    static final String EXTRA_KEY = "key";
    private TextView messageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value =  intent.getStringExtra(EXTRA_KEY);

        messageTextView = (TextView) findViewById(R.id.messageTextView);
        messageTextView.setText("\nNew Activity\nNombre: " + value);
    }


}
