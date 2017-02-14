package com.scriptingsystems.stringlistview.model;

/**
 * Created by jeanrojas on 21/1/17.
 */

public class Personas {
    private String nombre;
    private int edad;
    private String localidad;

    public Personas () {
        nombre = "";
        edad = 0;
        localidad = "";
    }

    public Personas(String nombre, int edad, String localidad ) {
        this.edad = edad;
        this.localidad = localidad;
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nLocalidad: "+getLocalidad();
    }
}
