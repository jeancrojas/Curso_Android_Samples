package com.scriptingsystems.listas2.adapter;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.scriptingsystems.listas2.Fruta;
import com.scriptingsystems.listas2.R;

/**
 * Created by jeanrojas on 12/2/17.
 */

public class Adaptador extends BaseAdapter {
    Fruta[] frutas;
    Context context;

    public Adaptador(Context context, Fruta[] frutas) {
        this.context = context;
        this.frutas = frutas;
    }

    @Override
    public int getCount() {
        //Tamaño del adaptador, es el tamaño de las frutas
        return frutas.length;
    }

    @Override
    public Object getItem(int position) {
        //Apartir de un indice que nos pasa como parametro
        return frutas[position];
    }

    @Override
    public long getItemId(int position) {
        //id de la clase fruta
        return frutas[position].getId();
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        //Inflar
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista_elemento = inflater.inflate(R.layout.elemento,parent, false);

        //lamando a los recursos
        ImageView imageViewImagen = (ImageView) vista_elemento.findViewById(R.id.imageViewImagen);

        TextView textViewNombre = (TextView) vista_elemento.findViewById(R.id.textViewNombre);
        final TextView textViewCantidad = (TextView) vista_elemento.findViewById(R.id.textViewCantidad);

        Button buttonMas = (Button) vista_elemento.findViewById(R.id.buttonMas);
        Button buttonMenos = (Button) vista_elemento.findViewById(R.id.buttonMenos);


        imageViewImagen.setImageBitmap(frutas[position].getImagen());
        textViewNombre.setText(frutas[position].getNombre());
        //Nunca podemos un valor de tipo numero, siempre hay que pasarlos como String
        textViewCantidad.setText( String.valueOf(frutas[position].getCantidad()) );


        buttonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(textViewCantidad.getText().toString());
                if (num < 99) {
                    frutas[position].setCantidad(++num);
                    textViewCantidad.setText( String.valueOf( frutas[position].getCantidad() ) );
                }
            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(textViewCantidad.getText().toString());
                if (num > 0) {
                    frutas[position].setCantidad(--num);
                    textViewCantidad.setText( String.valueOf( frutas[position].getCantidad() ) );
                }
            }
        });

        vista_elemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = frutas[position].getNombre() + " X " + String.valueOf(frutas[position].getCantidad());
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

            }
        });

        return vista_elemento;
    }
}
