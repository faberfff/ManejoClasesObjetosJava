package objectClassesJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase que representa los atributos de una fruta
 * @autor Faber Fernández Fernández
 */
public class Fruit {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Declaración de las variables de la clase
     */
    private final long id;
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();

    /**
     * Constructor que crea una instancia de la clase con los atributos id, name
     */
    public Fruit(){
        this.id = 001;
        this.name = "Piña";

    }

    /**
     * Constructor con parametros
     * @param id
     * @param name
     * @param averageWeight
     * @param colors
     */

    public Fruit(long id, String name, float averageWeight, ArrayList<String> colors) {
        this.id = id;
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Metodo que retorna el id de la fruta
     * @return id
     */
    public long getId() {
        return this.id;
    }

    /**
     * Metodo que retorna el nombre de la fruta
     * @return name
     */
    public String getName() {
        System.out.println("El nombre de la fruta es: " + name);
        return this.name;
    }

    /**
     * Metodo para darle un valor al atributo nombre
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que retorna el peso promedio de la fruta
     * @return averageWeight
     */
    public float getAverageWeight(){
        return this.averageWeight;
    }

    /**
     * Metodo que retorna arrayList de colores
     * @return
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }

    /**
     * Metodo encargado de darle valor al atributo arrayList
     * @param colors
     */
    public void setColors(ArrayList<String> colors)
    {
        this.colors = colors;
    }


}
