package com.generation.animales;

// con extends Animal jalara para tener herencia
public class Ave extends Animal {
    // haremos que herede los atributos de Animal
    private int alas;
    private int patas;
    private boolean vuela;


    public Ave () {
    }


    //constructor que a su vez esta llamando al padre para despues llamar al hijo
    public Ave(String nombre) {
        //primero llamar al constructor padre
        super(nombre); //hacemos referencia la constructor padre
        System.out.println("Constructor hijo");
    }

    //haremos un metodos
    public void hacerNido() {
        System.out.println("Estoy haciendo mi nido");
    }
    public void ponerHuevo() {
        System.out.println("Estoy poniendo un huevo");
    }

    //polimorfismo
    @Override
    public void comer() {
        System.out.println("Comiendo alpiste");
    }
    @Override
    public void respirar() {
        System.out.println("Respirando por el pico");
    }

}
