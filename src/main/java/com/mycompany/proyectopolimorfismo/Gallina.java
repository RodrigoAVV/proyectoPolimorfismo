package com.mycompany.proyectopolimorfismo;
public class Gallina extends Animal{
    private String color_pluma;

    public Gallina(String color_pluma, String nombre, int edad) {
        super(nombre, edad);
        this.color_pluma = color_pluma;
    }

    public String getColor_pluma() {
        return color_pluma;
    }

    public void setColor_pluma(String color_pluma) {
        this.color_pluma = color_pluma;
    }

    @Override
    public void comunicarse() {
        System.out.println("co co co");
    }
    
}
