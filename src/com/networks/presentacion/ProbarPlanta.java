package com.networks.presentacion;

import com.networks.modelo.Cactus;
import com.networks.modelo.Planta;
import com.networks.modelo.PlantaTropical;

public class ProbarPlanta {
    public static void main(String[] args) {
//
        Planta objPlantaTropical = new PlantaTropical("Palmera", 'E');
        System.out.println(objPlantaTropical.regar(5, 15));
//        Cactus c12 = (Cactus) objPlantaTropical;
        try{
            PlantaTropical objPT = (PlantaTropical) objPlantaTropical;
            Cactus c1 = (Cactus) objPlantaTropical;
        }catch (Exception e){
           e.printStackTrace();
        }finally {
            System.out.println("Entra al finally");
        }

        System.out.println("Hola Mundo");





    }
}