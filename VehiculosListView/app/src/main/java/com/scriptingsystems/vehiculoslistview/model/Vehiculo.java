package com.scriptingsystems.vehiculoslistview.model;

/**
 * Created by jeanrojas on 21/1/17.
 */

public class Vehiculo {

    private String modelo;
    private String fabricante;
    private String descripcion;
    private int miniatura;
    private int imagen;

    public Vehiculo(String descripcion, String fabricante, int imagen, int miniatura, String modelo) {
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.imagen = imagen;
        this.modelo = modelo;
        this.miniatura = miniatura;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Modelo: "+getModelo()+"\nFabricante: "+getFabricante()+"\nDescripción: "+getDescripcion();
    }
}
