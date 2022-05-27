package com.mycompany.proyectopolimorfismo;

import java.util.ArrayList;

public class ProyectoPolimorfismo {
    public static void main(String[] args) {
        Gato g1 = new Gato("20/06/2020","Lanita",2);
        Perro p1 = new Perro("Lanudo","Rocky",3);
        Gallina gg1 = new Gallina("Negro","Cocoroco",5);
        
        ArrayList<Animal> anaimales = new ArrayList<Animal>();
        anaimales.add(g1);
        anaimales.add(p1);
        anaimales.add(gg1);
        
        for (int i = 0; i < 3; i++) {
            anaimales.get(i).comunicarse();
        } 
    }
}
