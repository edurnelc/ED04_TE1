package com.mycompany.ud4_te1;

/**
 * Clase CCuenta, genera los metodos necesarios para la gestion del objeto CCuenta en la clase principal Main.
 * @version 5
 * @author Edurne Leite
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * El metodo getNombre consulta el atributo nombre de la clase CCuenta y lo devuleve como parametro.
     * @return nombre, atributo de la clase CCuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El metodo setNombre modifica el atribtuo nombre de la clase CCuenta
     * @param nombre nombre a poner en el atributo nombre, tipo string
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El metodo getCuenta consulta el atributo cuenta de la clase CCuenta y lo devuleve como parametro.
     * @return cuenta, el atributo cuante de la clase CCuenta 
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * El metodo setCuenta modifica el atribtuo cuenta de la clase CCuenta
     * @param cuenta cuanta a poner en el atributo cuenta, tipo string
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * El metodo setSaldo modifica el atribtuo saldo de la clase CCuenta.
     * @param saldo, saldo a poner en el atributo saldo, tipo double.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * El metodo getTipoInteres consulta el atributo tipo interes de la clase CCuenta y lo devuleve como parametro.
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * El metodo setTipoInteres modifica el atribtuo tipo interes de la clase CCuenta.
     * @param tipoInteres, tipo interes a a poner en el atributo, tipo double.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     *
     * @param nom, atributo nombre de la clase CCuenta, tipo string
     * @param cue, atributo cuenta de la clase CCuenta, tipo string
     * @param sal, atributo saldo de la clase CCuenta, tipo double
     * @param tipo, atributo tipoInteres de la clase CCuenta, tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * El metodo getSaldo consulta el atributo saldo de la clase CCuenta y lo devuleve como parametro.
     * @return  saldo, cantidad actual de dinero en CCuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * El metodo ingresar, ingresa la cantidad pasada como parametro y actualiza el saldo.
     * @param cantidad, cantidad de dinero a ingresar en la cuenta, tipo double
     * @throws Exception 
     * En caso de que la cantidad de dinero sea una numero negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    /**
     * El metodo retirar, resta la cantidad pasada como parametro y actualiza el saldo.
     * @param cantidad, cantidad de dinero a retirar de la cuenta, tipo double
     * @throws Exception
     * Si la cantidad de dinero que pasa como parametro es negativa
     * Si la cantidad de dinero que pasa como parametro es superior a la cantidad de saldo de la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }

    /**
     * Metodo que crea como constante la cantidad de 2 euros, la comision que cobra el banco.
     */
    public static final int COMISION = 2;
}
