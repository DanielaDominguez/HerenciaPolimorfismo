package com.generation;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.UberDriver;
import com.generation.uber.UberDriverBlack;

public class Main {
    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        UberDriverBlack driverBlack = new UberDriverBlack();
        driverBlack.setMinimum();

        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));
        System.out.println("Uber black");
        System.out.println(driverBlack.calculatePrice(6));
    }

/*
    pu blic static void main(String[] args) {
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

        Animal animal = new Animal();
        animal.comer();
        animal.hacerNido();
    }
*/
}
