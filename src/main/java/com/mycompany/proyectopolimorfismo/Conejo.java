package com.mycompany.proyectopolimorfismo;
public class Conejo extends Animal{
    private int kmh;

    public Conejo(int kmh, String nombre, int edad) {
        super(nombre, edad);
        this.kmh = kmh;
    }
    @Override
    public void comunicarse(){
        System.out.println("chui chui");
    }
    public int getKmh() {
        return kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }  
}
