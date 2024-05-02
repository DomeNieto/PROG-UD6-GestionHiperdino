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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Stack<Producto> getCestaCompra() {
        return cestaCompra;
    }

    public void setCestaCompra(Stack<Producto> cestaCompra) {
        this.cestaCompra = cestaCompra;
    }
    
}
