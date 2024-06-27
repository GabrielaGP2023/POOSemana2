package com.networks.modelo.ejemplostatic;

public class Factura {

    private static int consecutivoFactura;
    private int idFactura;

    public Factura() {
        idFactura= ++consecutivoFactura;
    }


    public static int getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public static void setConsecutivoFactura(int consecutivoFactura) {
        Factura.consecutivoFactura = consecutivoFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
}
