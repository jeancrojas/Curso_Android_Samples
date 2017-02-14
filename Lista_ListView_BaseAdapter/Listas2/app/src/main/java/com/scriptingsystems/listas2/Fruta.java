package com.scriptingsystems.listas2;

import android.graphics.Bitmap;

/**
 * Created by jeanrojas on 12/2/17.
 */

public class Fruta {
    String nombre;
    int cantidad;
    Bitmap imagen;
    long id;

    public Fruta(long id, String nombre, Bitmap imagen, int x, int y) {
        this.nombre = nombre;
        this.cantidad = 1;
        this.id = id;
        //Cortar las imagenes
        this.imagen = Bitmap.createBitmap(imagen
                ,x*imagen.getWidth()/4
                ,y*imagen.getHeight()/3
                ,imagen.getWidth()/4
                ,imagen.getHeight()/3 );

        //Escala de la imagen
        this.imagen.createScaledBitmap(this.imagen, 128,128, false);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getId() {
        return id;
    }



    public Bitmap getImagen() {
        return imagen;
    }



    public String getNombre() {
        return nombre;
    }

}
