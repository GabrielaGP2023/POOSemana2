package com.networks.presentacion;

import com.networks.modelo.ejemplointerfaces.*;

public class ProbarInterfaces {
    public static void main(String[] args) {
        // Instanciar un avion con el nombre de objeto a1
        Avion a1 = new Avion();
//Instanciar un avion con el nombre de objeto a2 en una referencia de ObjetoVolador
        IObjetoVolador a2 = new Avion();
//Instanciar un avion con el nombre de objeto a3 en una referncia de ObjetoVolador
        IObjetoVolador a3 = new Avion();

//Instanciar un ave con el nombre de a4
        Ave a4 = new Ave();
//Instanciar un ave con el nombre de a5 usando el constructor completo
//en una referencia de ObjetoVolador
        IObjetoVolador a5 = new Ave();
//Instanciar un avión con el nombre de objeto a6 usando el constructor completo
//en una referencia de ObjetoVolador
        IObjetoVolador a6 = new Avion();
//Instanciar un Superman con el nombre de a7
//en una referencia de ObjetoVolador
        //Instanciar un Hidroavion
        HIdroAvion h1 = new HIdroAvion();
//Instanciar un Hidroavion con el nombre de objeto ha2 en una referencia Nautico
        INautico ha2 = new HIdroAvion();
//Instanciar una barcaza con el nombre de objeto b1
        Barcaza b1 = new Barcaza();
//Instanciar una barcaza con el nombre de objeto b2, en una referencia de Nautico
        INautico b2 = new Barcaza();
        IObjetoVolador a7 = new Superman();

        IObjetoVolador[] objetos = {a1, a2,a3, a4,a5,a6,a7, h1,(IObjetoVolador) ha2 };

        for(IObjetoVolador elemento: objetos){
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());

            if(elemento instanceof HIdroAvion){
                System.out.println(((INautico) elemento).atracar());
                System.out.println(((INautico) elemento).navegar());
            }

        }

    }

}
