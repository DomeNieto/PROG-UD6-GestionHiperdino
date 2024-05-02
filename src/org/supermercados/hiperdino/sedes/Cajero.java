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

}
