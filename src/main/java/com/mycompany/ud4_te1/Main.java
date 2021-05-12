package com.mycompany.ud4_te1;

/**
 * La clase Main es la clase principal de la aplicacion donde se realiza la operativa de la CCuenta.
 * @version 5
 * @author Edurne Leite
 */
public class Main {

    /**
     * Metodo principal de la clase Main.
     * @param args
     */
    public static void main(String[] args) {
        operativaCuenta(2300.0);
    }

    /**
     * Metodo que gestiona la operativa de la CCuenta.
     * @param cantidad, cantidad a retirar de la CCuenta, tipo double
     */
    public static void operativaCuenta(double cantidad) {
        CCuenta cuentaTrabajo;
        double saldoActual;

        cuentaTrabajo = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        saldoActual = cuentaTrabajo.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuentaTrabajo.retirar(cantidad);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Abono en cuenta");
            cuentaTrabajo.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
