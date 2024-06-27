package com.networks.modelo.ejemplointerfaces;

public class HIdroAvion implements INautico,IObjetoVolador{
    @Override
    public String atracar() {
        return "El HidroAvión atraca";
    }

    @Override
    public String navegar() {
        return "El HidroAvión navega";
    }

    @Override
    public String volar() {
        return "El HidroAvión vuela";
    }

    @Override
    public String despegar() {
        return "El HidroAvión despega";
    }

    @Override
    public String aterrizar() {
        return "El HidroAvión aterriza";
    }
}
