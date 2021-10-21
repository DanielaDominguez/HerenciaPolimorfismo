package com.generation.animales;

public abstract class Perro extends Animal {
    //atributos
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super(nombre);

    }

    public void jugar() {
        System.out.println("Estoy jugando");
    }
    public void ladrar() {
        System.out.println("Goff");
    }

    //anotaciones
    @Override
    public void comer() {
        System.out.println("Comiendo croquetas");
    }
    @Override
    public abstract void respirar();

}
