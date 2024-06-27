package com.networks.presentacion;

import com.networks.modelo.ejemplointerfaces.*;

public class ProbarInterfacesFase2 {
    public static void main(String[] args) {
//        IVehiculo c1 = new Coche(35);
//        Conductor c2 = new Conductor(c1);
//        System.out.println(c2.conducir());
        Coche c1 = new Coche("1234kju","Auris");
        TallerPintura tP1 = new TallerPintura();
        TallerMecanica tM1 = new TallerMecanica();
		SeguroCoche s1 = new SeguroCoche();
		s1.setTaller(tP1);
		System.out.println(s1.toString());
        System.out.println(s1.reparar(c1));
        s1.setTaller(tM1);
        System.out.println(s1.reparar(c1));


    }
}
