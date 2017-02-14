package com.scriptingsystems.stringlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.scriptingsystems.stringlistview.adapter.NamesAdapter;
import com.scriptingsystems.stringlistview.model.Personas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Personas> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Personas("Jean", 30, "Madrid"));
        listaPersonas.add(new Personas("Ángel", 10, "Madrid"));
        listaPersonas.add(new Personas("Rosa", 50, "Madrid"));
        listaPersonas.add(new Personas("Javier", 40, "Madrid"));
        listaPersonas.add(new Personas("Flor", 50, "Madrid"));


        ListView namesListView = (ListView) findViewById(R.id.namesListView);
        namesListView.setAdapter( new NamesAdapter(this, R.layout.row_layout, listaPersonas) );
    }
}
