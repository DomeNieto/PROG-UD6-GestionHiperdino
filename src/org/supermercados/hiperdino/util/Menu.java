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

}
