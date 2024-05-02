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

    public void agregarProducto(Producto producto) {

        cestaCompra.add(producto);
        System.out.println("Porducto añadido correctamente.");

    }

    public void quitarProducto(String nombreProducto) {

        if (cestaCompra.isEmpty()) {
            System.out.println("La cesta está vacía. No se puede quitar ningún producto.");
            return;
        }

        boolean productoEncontrado = false;
        for (Producto producto : cestaCompra) {

            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                cestaCompra.remove(producto);
                productoEncontrado = true;
                System.out.println("Producto " + nombreProducto + " quitado de la cesta.");
                break;
            }
            
        }

        if (!productoEncontrado) {
            System.out.println("El producto " + nombreProducto + " no se encuentra en la cesta.");
        }
    }

}
