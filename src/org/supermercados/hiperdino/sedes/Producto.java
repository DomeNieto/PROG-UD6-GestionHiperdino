package org.supermercados.hiperdino.sedes;

public class Producto {

    private String nombre;
    final private String marca = "Hiperdino";
    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
