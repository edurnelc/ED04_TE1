package com.mycompany.ud4_te1;

/**
 *
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
     * @param nombre the nombre to set
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
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * El metodo setSaldo consulta el atributo saldo de la clase CCuenta y lo devuleve como parametro.
     * @param saldo the saldo to set
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
     * El metodo setTipoInteres consulta el atributo tipo interes de la clase CCuenta y lo devuleve como parametro.
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     *
     * @param nom, atributo nombre de la clase CCuenta
     * @param cue, atributo cuenta de la clase CCuenta
     * @param sal, atributo saldo de la clase CCuenta
     * @param tipo, atributo tipoInteres de la clase CCuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * El metodo getSaldo consulta el atributo saldo de la clase CCuenta y lo devuleve como parametro.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * El metodo ingresar, ingresa la cantidad pasada como parametro y actualiza el saldo.
     * @param cantidad, cantidad de dinero a ingresar en la cuenta.
     * @throws Exception, en caso de que la cantidad de dinero sea una numero negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    /**
     * El metodo retirar, resta la cantidad pasada como parametro y actualiza el saldo.
     * @param cantidad, cantidad de dinero a retirar de la cuenta.
     * @throws Exception, si la cantidad de dinero que pasa como parametro es negativa
     * @throws Exception, si la cantidad de dinero que pasa como parametro es superior a la cantidad de saldo de la cuenta.
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
