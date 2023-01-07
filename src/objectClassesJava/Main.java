package objectClassesJava;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

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
        fruit.getName();

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
