package objectClassesJava;

public class Pet {

    /**
     * Declaración de las variables de la clase
     */
    private String name;
    private String owner;
    protected int age;
    private String type;

    /**
     * Constructor que crea una instancia de la clase
     */
    public Pet(){
        this.name = "Tom";
        this.owner = "Faber";
        this.age = 3;
        this.type = "Gato";
    }

    /**
     * Metodo que retorna el nombre de la mascota
     * @return name
     */
    public String getName() {
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
     * Metodo que retorna el nombre del propietario de la mascota
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Metodo para darle un valor al atributo owner
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Metodo que retorna la edad de la mascota
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Metodo para darle un valor al atributo edad
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Metodo que retorna el tipo de mascota
     * @return type
     */
    public String getType(){
        System.out.println("El tipo de la mascota es: " + type);
        return this.type;
    }

    /**
     * Metodo para darle un valor al atributo tipo
     * @param type
     */
    public void set(String type) {
        this.type = type;
    }

    private void showPet() {
        System.out.println("Nombre de la mascota es " + name + " Nombre del propietario es " + owner +
                " La edad es " + age + " El tipo de mascota " + type);
    }

}
