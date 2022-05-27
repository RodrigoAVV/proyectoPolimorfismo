package com.mycompany.proyectopolimorfismo;
public class Gato extends Animal {
    private String fecha_nacimiento;

    @Override
    public void comunicarse() {
        System.out.println("miau miau");
    }

    public Gato(String fecha_nacimiento, String nombre, int edad) {
        super(nombre, edad);
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
