package com.networks.modelo.ejemplofinal;

public final class Producto {
    private final double IVA = 0.21;
    private double precio;

    public final double calcularPrecioTotal(){
       return precio*IVA;
    }

    public Producto() {
    }

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getIVA() {
        return IVA;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
