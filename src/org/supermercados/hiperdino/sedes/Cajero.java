package org.supermercados.hiperdino.sedes;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {

    private int numeroIdenticacion;
    private Queue<Cliente> colaClientes = new LinkedList<>();
    private boolean cajaAbierta = false;
    private int clientesAtendidos = 0;

    public Cajero(int numeroIdenticacion) {

        this.numeroIdenticacion = numeroIdenticacion;

    }

    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

    public int getnumeroIdenticacion() {
        return numeroIdenticacion;
    }

    public void setnumeroIdenticacion(int numeroIdenticacion) {
        this.numeroIdenticacion = numeroIdenticacion;
    }

    public Queue<Cliente> getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(Queue<Cliente> colaClientes) {
        this.colaClientes = colaClientes;
    }

    public void abrirCaja() {

        if (!cajaAbierta) {
            cajaAbierta = true;
            System.out.println("La caja está abierta");
        } else {
            System.out.println("La caja está abierta en este momento");
        }

    }

    public void agregarCliente(Cliente cliente) {

        colaClientes.add(cliente);

    }

    public void atenderCliente() {

        if (!colaClientes.isEmpty()) {
            colaClientes.poll();
            System.out.println("Cliente atendido");
            clientesAtendidos++;
        } else {
            System.out.println("No hay clientes en la cola");
        }

    }

    public void mostrarClientesPendientes() {

        System.out.println("Los clientes pendientes del cajero " + numeroIdenticacion + " son: ");

        if (!colaClientes.isEmpty()) {
            for (Cliente cliente : colaClientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No hay clientes en la cola");
        }

    }

    public void cerrarCaja() {

        if (!colaClientes.isEmpty()) {
            System.out.println("No se puede cerrar la caja, quedan clientes en la cola");
        } else {
            cajaAbierta = false;
            System.out.println("La caja del cajero " + numeroIdenticacion + " fue cerrada exitosamente");
        }

    }
}
