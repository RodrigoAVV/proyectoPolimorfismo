package com.mycompany.proyectopolimorfismo;
public class Perro extends Animal{
    private String tipo_pelo;

    public Perro(String tipo_pelo, String nombre, int edad) {
        super(nombre, edad);
        this.tipo_pelo = tipo_pelo;
    }
    public void comunicarse(){
        System.out.println("guau guau");
    }

    public String getTipo_pelo() {
        return tipo_pelo;
    }

    public void setTipo_pelo(String tipo_pelo) {
        this.tipo_pelo = tipo_pelo;
    }
    
}
