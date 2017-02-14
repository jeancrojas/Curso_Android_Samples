package com.scriptingsystems.listas2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.scriptingsystems.listas2.adapter.Adaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Fruta[] frutas;
    Adaptador adap;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Llamamos a la imagen
        Bitmap imgFrutas = BitmapFactory.decodeResource(getResources(),R.drawable.frutas);

        //Array de frutas
        frutas = new Fruta[12];

        frutas[0] = new Fruta(0, "Limón",imgFrutas,0,0);
        frutas[1] = new Fruta(1, "Kiwi",imgFrutas,1,0);
        frutas[2] = new Fruta(2, "Mango",imgFrutas,2,0);
        frutas[3] = new Fruta(3, "Melocotón",imgFrutas,3,0);

        frutas[4] = new Fruta(4, "Piña",imgFrutas,0,1);
        frutas[5] = new Fruta(5, "Uva",imgFrutas,1,1);
        frutas[6] = new Fruta(6, "Naranja",imgFrutas,2,1);
        frutas[7] = new Fruta(7, "Cereza",imgFrutas,3,1);

        frutas[8] = new Fruta(8, "Mandarina",imgFrutas,0,2);
        frutas[9] = new Fruta(9, "Manzana",imgFrutas,1,2);
        frutas[10] = new Fruta(10, "Platano",imgFrutas,2,2);
        frutas[11] = new Fruta(11, "Pera",imgFrutas,3,2);

        adap = new Adaptador(this, frutas);
        lista = (ListView) findViewById(R.id.listViewLista);
        lista.setAdapter(adap);

    }
}
