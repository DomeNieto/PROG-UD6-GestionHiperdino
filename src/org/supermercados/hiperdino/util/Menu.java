package org.supermercados.hiperdino.util;

public class Menu {

    public static void mostrarMenuPrincipal() {

        System.out.print("""
                  \nGestión de locales Hiperdino
                Seleccione una opción. ¿Quién eres?
                a. Cliente.
                b. Cajero.
                c. Salir del programa.
                """);
    }

    public static void mostrarMenuCajero() {

        System.out.print("""
                \n\tMENÚ DE CAJERO
                Seleccione una opcion:
                  a. Abrir caja.
                  b. Añadir cliente/s a la cola.
                  c. Atender un cliente.
                  d. Mostrar los clientes pendientes.
                  e. Cerrar supermecados.
                  f. Salir de sesión.
                """);

    }

    public static void mostrarMenuCliente() {

        System.out.print("""
                \n\tMENÚ DE CLIENTE
                Seleccione una opcion:
                  a. Agregar un productos a la cesta.
                  b. Quitar un producto de la cesta.
                  c. Mostrar productos de la cesta.
                  d. Ver total de productos.
                  e. Salir de sesión.
                """);

    }
}
