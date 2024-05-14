package org.example;

import org.example.clases.Banco;
import org.example.clases.Posnet;
import org.example.clases.Titular;
import org.example.clases.tarjetas.Visa;

import java.io.IOException;
import java.util.Scanner;



public class Main {
    static Visa visa = new Visa(new Banco("Galicia", "2056498159"), 123,15000,new Titular("Cristina","Morales", 12312312));
    static Posnet posnet = new Posnet();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monto;
        int cuotas;
        posnet.leerTarjeta(visa);
        System.out.println("Ingrese el monto a pagar");
        monto = input.nextDouble();
        do {

            System.out.println("ingrese la cantidad de cuotas");
            cuotas = input.nextInt();
            if (cuotas<1 || cuotas>6) {
                System.out.println("Las cuotas no pueden ser mayor a 6");
            }
        } while (cuotas<1 || cuotas>6);
        double montoActualizado= posnet.calcularPagoTotal(monto,cuotas);

        System.out.println("Usted pagara " + monto + "en " +cuotas + " de " +
                montoActualizado/cuotas);
        System.out.println("el pago total es de: " + montoActualizado);

        System.out.println("Desea continuar? s/n");
        String opcion;

        do {
            try {
                opcion = String.valueOf(System.in.read());
            } catch (IOException e) {
                opcion = "";
                throw new RuntimeException(e);
            }
        } while (!opcion.equalsIgnoreCase("s") || !opcion.equalsIgnoreCase("n"));

        if (opcion.equalsIgnoreCase("s")){
            System.out.println(posnet.efectuarPago(monto, cuotas));
        }


    }
}