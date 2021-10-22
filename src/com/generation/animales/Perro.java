package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos {
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzz");

    }

    @Override
    public void hablar() {
        System.out.println("Guafff");

    }

    public void ladrar() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por la nariz");
    }

    @Override
    public void gestar() {
        System.out.println("Tengo 2 meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");
    }
}