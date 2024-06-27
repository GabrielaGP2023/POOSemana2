package com.networks.modelo.ejemplointerfaces;

public class Barcaza extends Vehiculo implements INautico{
    @Override
    public String atracar() {
        return "La barcaza está atracando";
    }

    @Override
    public String navegar() {
        return "La barcaza está navegando";
    }
}
