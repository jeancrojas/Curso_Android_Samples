package com.scriptingsystems.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate ()...");
        Toast.makeText(this, "onCreate ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy ()...");
        Toast.makeText(this, "onDestroy ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart ()...");
        Toast.makeText(this, "onStart ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop ()...");
        Toast.makeText(this, "onStop ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause ()...");
        Toast.makeText(this, "onPause ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume ()...");
        Toast.makeText(this, "onResume ()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart ()...");
        Toast.makeText(this, "onRestart ()", Toast.LENGTH_LONG).show();
    }
}
