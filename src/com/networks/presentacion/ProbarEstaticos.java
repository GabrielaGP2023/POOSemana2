package com.networks.presentacion;

import com.networks.modelo.ejemplostatic.Calculadora;
import com.networks.modelo.ejemplostatic.Factura;

public class ProbarEstaticos {
    public static void main(String[] args) {
        System.out.println(Factura.getConsecutivoFactura());
        Factura f1 = new Factura();
        System.out.println("id Factura ->"+ f1.getIdFactura());
        Factura f2 = new Factura();
        System.out.println("id Factura -> "+ f2.getIdFactura());

        System.out.println(Calculadora.suma(5,4));
        System.out.println(Calculadora.resta(9,3));
        System.out.println(Calculadora.multiplicar(5,3));
    }
}
