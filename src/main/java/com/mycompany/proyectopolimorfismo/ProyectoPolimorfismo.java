package com.mycompany.proyectopolimorfismo;

import java.util.ArrayList;

public class ProyectoPolimorfismo {
    public static void main(String[] args) {
        Gato g1 = new Gato("20/06/2020","Lanita",2);
        Perro p1 = new Perro("Lanudo","Rocky",3);
        Gallina gg1 = new Gallina("Negro","Cocoroco",5);
        Conejo c1 = new Conejo(60,"Conejo1",2);
        /*
            No recomendado
            Animal[] n = new Animal[5];
        */
        ArrayList<Animal> anaimales = new ArrayList<Animal>();
     
        anaimales.add(g1);
        anaimales.add(p1);
        anaimales.add(gg1);
        anaimales.add(c1);
        
        for (int i = 0; i < anaimales.size(); i++) {
            anaimales.get(i).comunicarse();
        } 
    }
}
