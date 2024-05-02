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
    
}
