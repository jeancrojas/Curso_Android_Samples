package com.scriptingsystems.listas1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerLista;
    String[] opciones = {"Primera", "Segunda", "Tercera"};
    boolean listo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerLista = (Spinner) findViewById(R.id.spinnerLista);

        /*Sobreescribimos la lista indicada en el Design del Layout*/
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLista.setAdapter(arrayAdapter);


        //Se activa cuando el usuario selecciona un item de la lista
        spinnerLista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //Cuando ha seleccionado
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (listo) {
                    Snackbar.make(view
                            , "Opción: " + spinnerLista.getSelectedItem().toString()
                            , Snackbar.LENGTH_SHORT).show();
                }
                listo = true;
            }
            //Cuando ha cerrado el combo sin cambiar de item, no ha elegido
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
