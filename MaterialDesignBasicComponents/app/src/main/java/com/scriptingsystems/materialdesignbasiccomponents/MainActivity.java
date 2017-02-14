package com.scriptingsystems.materialdesignbasiccomponents;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton
                = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Click on FloatActionButton",Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
