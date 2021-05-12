package com.mycompany.ud4_te1;


public class Main {

    public static void main(String[] args) {
        operativaCuenta(2300.0);
    }

    public static void operativaCuenta(double cantidad) {
        CCuenta cuentaTrabajo;
        double saldoActual;

        cuentaTrabajo = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        saldoActual = cuentaTrabajo.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuentaTrabajo.retirar(cantidad);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Abono en cuenta");
            cuentaTrabajo.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
