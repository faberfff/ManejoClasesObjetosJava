package objectClassesJava;

import java.util.Date;

/**
 * Clase que representa los atributos de una persona
 * @autor Faber Fernández Fernández
 */
public class Person {

    /**
     * Declaración de las variables de la clase
     */
    private long id;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Constructor que crea una instancia de la clase
     */

    public Person() {
        this.id = 001;
        this.name = "Faber";
        this.lastName1 = "Fernández";
        this.lastName2 = "Fernández";
        this.height = 1.70f;

    }

    /**
     * Constructor con parametros
     * @param id
     * @param name
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height
     */
    public Person(long id, String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Metodo que retorna el id de la persona
     * @return id
     */
    public long getId(){
        System.out.println("Numero de Identidad: " + id);
        return this.id;
    }

    /**
     * Metodo para darle un valor al atributo accountNumber
     * @param accountN
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Metodo que retorna el nombre
     * @return name
     */
    public String getName() {
        System.out.println("Su nombre es: " + name);
        return this.name;
    }

    /**
     * Metodo para darle un valor al atributo name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que retorna el primer apellido
     * @return lastName1
     */
    public String getLastName1() {
        return this.lastName1;
    }

    /**
     * Metodo para darle un valor al atributo primer apellido
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Metodo que retorna el segundo apellido
     * @return lastName2
     */
    public String getLastName2() {
        return this.lastName2;
    }

    /**
     * Metodo para darle un valor al atributo segundo apellido
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Metodo que retorna la fecha de nacimiento
     * @return dateBirth
     */
    public Date getDateBirth() {
        return this.dateBirth;
    }

    /**
     * Metodo para darle un valor al atributo fecha de nacimiento
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Metodo que retorna la estatura
     * @return Height
     */
    public float getHeight() {
        System.out.println("Su estatura es: " + height);
        return this.height;
    }

    /**
     * Metodo para darle un valor al atributo estatura
     * @param Height
     */
    public void setHeight(float height) {
        this.height = height;
    }

}
