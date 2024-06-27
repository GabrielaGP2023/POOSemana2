package com.networks.modelo.ejemplointerfaces;

public class Globo {
    private static int consecutivo;
    private String color;
    private int idGlobo;

    public String inflar(){
        return "El globo se esta inflando ...";
    }
    public String explotar(){
        return "El globo en explosión";
    }

    @Override
    public String toString() {
        return "Globo{" +
                "color='" + color + '\'' +
                ", idGlobo=" + idGlobo +
                '}';
    }

    public Globo() {
        idGlobo = ++consecutivo;
    }

    public Globo(String color) {
        this();
        this.color = color;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdGlobo() {
        return idGlobo;
    }


}
