package com.generation.animales;

public abstract class Animal {
    //declaramos atributos
    protected String nombre;
    protected int edad;

    //sin parametros
    public Animal () {
    }

    //un parametro en este caso nombre
    //declaro constructor, disparara cuando wl new lo usamos en el objeto
    //sirve para inicializar valores
    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor padre");
    }

    //dos parametros en este caso nombre y edad
    public Animal (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //declaramos metodos, debo llamarlo para que trabaje
    public void comunicarse() {
        System.out.println("Hola");
    }
    public void comer() {
        System.out.println("estoy comiendo");
    }

    public abstract void respirar();
}
