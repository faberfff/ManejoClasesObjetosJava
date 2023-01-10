package objectClassesJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Se crea un objeto de tipo BufferedReader para inter actuar con la consola
         */
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Se cra una instancia de la clase persona
         */
        Person person = new Person();
        person.getId();
        person.getName();

        /**
         * Se cra una instancia de la clase cuenta bancaria
         */
        BankAccount bank = new BankAccount();
        bank.getAccountNumber();

        /**
         * Se cra una instancia de la clase computador
         */
        Computer computer = new Computer();
        computer.getBrand();

        /**
         * Se cra una instancia de la clase Fruta
         */
        Fruit fruit = new Fruit();
        ArrayList<String> colors = new ArrayList<String>();
        fruit.getName();
        String col;
        System.out.println("Ingresa un color: ");
        col = bfr.readLine();;
        colors = fruit.getColors(col);
        fruit.showColors(colors);

        /**
         * Se cra una instancia de la clase Mascota
         */
        Pet pet = new Pet();
        pet.getType();

        /**
         * Se cra una instancia de la clase Producto
         */
        Product product = new Product();
        product.getName();

    }
}
