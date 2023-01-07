package objectClassesJava;

/**
 * Clase que representa los atributos de un computador
 * @autor Faber Fernández Fernández
 */
public class Computer {

    /**
     * Declaración de las variables de la clase
     */
    public String brand;
    public int numberProcessors;
    private String type;
    private String storage;

    /**
     * Constructor que crea una instancia de la clase
     */
    public Computer() {

    }

    /**
     * Metodo que retorna la marca del computador
     * @return brand
     */
    public String getBrand() {
        System.out.println("La marca del Pc es: " + brand);
        return this.brand;
    }

    /**
     * Metodo para darle un valor al atributo marca
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Metodo que retorna la cantidad de procesadores que tiene del computador
     * @return brand
     */
    public int getNumberProcessors() {
        return this.numberProcessors;
    }

    /**
     * Metodo para darle un valor al atributo numero de procesadores
     * @param numberProcessors
     */
    public void setNumberProcessors(int numberProcessors) {
        this.numberProcessors = numberProcessors;
    }

    /**
     * Metodo que retorna el tipo de computador
     * @return brand
     */
    public String getType() {
        return this.type;
    }

    /**
     * Metodo para darle un valor al atributo el tipo de computador(escritorio o portatil)
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Metodo que retorna el almacenamiento del computador
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * Metodo para darle un valor al atributo capacidad de almacenamiento del computador
     * @param storage
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    private void showComputer() {
        System.out.println("computador de marca " + brand + " Con numero de procesadores de: " + numberProcessors +
                "Computador de " + type + "Su capacidad de almacenamiento es de: " + storage);
    }
}
