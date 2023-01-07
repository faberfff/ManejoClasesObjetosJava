package objectClassesJava;

/**
 * Clase que representa los atributos de un producto
 * @autor Faber Fernández Fernández
 */
public class Product {

    protected static int id;
    private String name;
    private int stock;
    private double price;

    /**
     * Constructor que crea una instancia de la clase
     */

    public Product(){

    }

    /**
     * Metodo que retorna el nombre del producto
     * @return name
     */

    public String getName() {
        System.out.println("El producto seleccionado es: " + name);
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
     * Metodo que retorna el stock del producto
     * @return stock
     */
    public int getStock() {
        return this.stock = stock;
    }

    /**
     * Metodo para darle un valor al atributo stock
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo que retorna el precio del producto
     * @return price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Metodo para darle un valor al atributo precio
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


}
