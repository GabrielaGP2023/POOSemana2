package com.networks.presentacion;

import com.networks.modelo.ejemplointerfaces.Globo;

public class ProbarGlobo {
    public static void main(String[] args) {
        Globo g1 = new Globo("azul");
        System.out.println(g1.toString());

        Globo g2 = new Globo();
        System.out.println(g2.toString());
    }
}
