package objectClassesJava;

/**
 * Clase que representa una cuenta bancaria
 * @autor Faber Fernández Fernández
 */
public class BankAccount {

    /**
     * Declaracion de las variables de la clase
     */
    private int accountNumber;
    protected boolean activated;

    private String nameUser;

    private String typeAccount;

    /**
     * Constructor que crea una instancia de la clase
     */
    public BankAccount(){
        this.accountNumber = 123;
        this.activated = true;
        this.nameUser = nameUser;
        this.typeAccount = "Ahorros";
    }

    /**
     * Constructor con parametros
     * @param accountNumber
     * @param activated
     * @param nameUser
     * @param typeAccount
     */
    public BankAccount(int accountNumber, boolean activated, String nameUser, String typeAccount) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.nameUser = nameUser;
        this.typeAccount = typeAccount;
    }

    /**
     * Metodo que retorna un numero de cuenta
     * @return accountNumber
     */
    public int getAccountNumber() {
        System.out.println("Numero de cuenta es: " + accountNumber );
        return accountNumber;
    }

    /**
     * Metodo para darle un valor al atributo accountNumber
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Metodo que retorna el estado de la cuenta
     * @return activated
     */
    public boolean getActivated(){
        System.out.println("¿Esta la cuenta actiada?: " + activated);
        return activated;
    }

    /**
     * Metodo para darle un valor al atributo activated
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Metodo que retorna el nombre del titular de la cuenta
     * @return nameUser
     */
    public String getNameUser(){
        return nameUser;
    }

    /**
     * Metodo para darle un valor al atributo nameUser
     * @param nameUser
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

}
