import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.supermercados.hiperdino.sedes.Cajero;
import org.supermercados.hiperdino.sedes.Cliente;
import org.supermercados.hiperdino.sedes.Producto;
import org.supermercados.hiperdino.util.Generador;
import org.supermercados.hiperdino.util.Menu;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientesConCompras = new ArrayList<>();
        Cajero cajero = new Cajero(1);

        boolean entrar = true;

        while (entrar) {

            Menu.mostrarMenuPrincipal();
            System.out.print("Escriba la opcion: ");

            String opcion = scanner.next().toLowerCase();

            switch ((opcion)) {
                case "a": // Cliente
                    Cliente cliente = Generador.personAleatorio();
                    ;
                    boolean seleccionCliente = true;
                    while (seleccionCliente) {
                        Menu.mostrarMenuCliente();
                        System.out.print("Escriba la opcion: ");

                        String opcionCliente = scanner.next().toLowerCase();

                        switch (opcionCliente) {
                            case "a":
                                Producto producto = Generador.productoAleatorio();
                                cliente.agregarProducto(producto);
                                clientesConCompras.add(cliente);
                                break;

                            case "b":
                                System.out.println(cliente.mostrarListaProductos());

                                System.out.print("Ingrese el nombre del producto a quitar: ");
                                String nombreProducto = scanner.next();
                                cliente.quitarProducto(nombreProducto);
                                break;

                            case "c":
                                System.out.println(cliente.mostrarListaProductos());
                                break;

                            case "d":
                                if (cliente != null) {
                                    System.out.println("Total de productos en la cesta: " + cliente.totalProductos());
                                } else {
                                    System.out.println("Primero debes agregar un cliente.");
                                }
                                break;

                            case "e":
                                System.out.println("Adeus!");
                                seleccionCliente = false;
                                break;

                            default:
                                System.out.println("Selecciona un opción que exista");
                                break;
                        }

                    }

                    break;
                case "b": // Cajero

                    boolean seleccionCajero = true;

                    while (seleccionCajero) {

                        Menu.mostrarMenuCajero();
                        System.out.print("Escriba la opcion: ");
                        String opcionCajero = scanner.next().toLowerCase();

                        switch (opcionCajero) {
                            case "a":

                                cajero.abrirCaja();

                                break;

                            case "b":
                                if (cajero.isCajaAbierta() && !clientesConCompras.isEmpty()) {

                                    for (Cliente clienteConCompra : clientesConCompras) {
                                        if (!cajero.getColaClientes().contains(clienteConCompra)) {
                                            cajero.agregarCliente(clienteConCompra);
                                        }
                                    }
                                    System.out.println("Cliente/s añadido correctamente");

                                } else {
                                    System.out.println(
                                            "La caja aún no ha abierto o no se ha ingresado ningún nuevo cliente. ");
                                }
                                clientesConCompras.clear();
                                break;

                            case "c":

                                cajero.atenderCliente();

                                break;

                            case "d":

                                cajero.mostrarClientesPendientes();

                                break;

                            case "e":

                                cajero.cerrarCaja();

                                break;

                            case "f":
                                System.out.println("Adeus!");
                                System.out.println("El cajero a cargo fue:");
                                System.out.println(cajero.toString());
                                seleccionCajero = false;
                                break;

                            default:
                                System.out.println("Selecciona un opción que exista");
                                System.out.println("El cajero a cargo fue:");
                                System.out.println(cajero.toString());
                                break;
                        }
                    }

                    break;

                case "c":

                    System.out.println("Saliendo del programa.");
                    entrar = false;
                    break;
                default:
                    System.out.println("Selecciona un opción que exista");
                    break;
            }

        }
        scanner.close();

    }
}
