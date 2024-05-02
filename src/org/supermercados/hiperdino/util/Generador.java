package org.supermercados.hiperdino.util;

import java.util.Random;

import org.supermercados.hiperdino.sedes.Producto;

public class Generador {

    private static String[] personas = { "Antonio", "Belén", "Celeste", "Bartolomé", "Antonia", "Dolly", "Gerardo",
            "Fernando", "Lorena", "Darwin", "Emily", "Luciana", "Raul", "Pepe", "Lucas", "Felipe", "Hilda", "Andrea",
            "Samantha", "Alejandra" };

    private static String[] productos = { "Tomate", "Huevo", "Leche", "Plátano Verde", "Sal", "Carne", "Pollo",
            "Azucar",
            "Arroz", "Jamón Serrano", "Pulpo", "Pera" };

    public static Producto productoAleatorio() {

        Random nombre = new Random();
        int indiceRandom = nombre.nextInt(productos.length);

        Random precio = new Random();

        float precioRandom = (float) (Math.round((precio.nextFloat() * 15 + 1) * 100.0) / 100.0);

        Producto producto = new Producto(productos[indiceRandom], precioRandom);
        return producto;

    }

}
