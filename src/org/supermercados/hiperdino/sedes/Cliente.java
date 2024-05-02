package org.supermercados.hiperdino.sedes;

import java.util.Stack;

public class Cliente {

    private String nombre;
    private String dni;
    private Stack<Producto> cestaCompra = new Stack<>();

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

}
