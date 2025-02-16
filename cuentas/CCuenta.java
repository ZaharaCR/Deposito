package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones de ingreso y retiro de dinero.
 * Permite consultar el saldo, ingresar dinero y retirar fondos, asegurando que
 * las operaciones sean válidas mediante el control de excepciones.
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     * Crea una cuenta sin datos iniciales.
     */
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para consultar el saldo de la cuenta.
     * @return saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad Cantidad a ingresar (debe ser positiva).
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta si hay saldo suficiente.
     * @param cantidad Cantidad a retirar (debe ser positiva y menor o igual al saldo).
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    // Métodos get y set para encapsular los atributos
    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular.
     */
    public String getNombre() { return nombre; }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el número de cuenta.
     * @return Número de cuenta en formato String.
     */
    public String getCuenta() { return cuenta; }

    /**
     * Establece el número de cuenta.
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    /**
     * Obtiene el saldo disponible en la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double getSaldo() { return saldo; }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) { this.saldo = saldo; }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInterés() { return tipoInterés; }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInterés Nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }
}
