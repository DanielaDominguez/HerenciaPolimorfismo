package com.generation;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declaramso objeto
        Ave ave = new Ave("petirrojo");
        Ave ave2 = new Ave();
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

        System.out.println("-----------------------------------------");
        Perro lomito = new Perro("pulgas") {
            @Override
            public void respirar() {

            }
        };
        //lomito.jugar();
        //lomito.comer();

        /*
        Animal animal = new Animal();
        animal.comer();
        animal.hacerNido();
        */

    }
}
