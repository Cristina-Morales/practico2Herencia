package org.example.clases;

public class Familiar extends Apartamento{

    public Familiar(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
    }

    public double getValorm2() {
        return 1800000;
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }
    @Override
    public void imprimir() {
        System.out.println("Familiar");
        System.out.println(   "valor:        " + getValorInmueble());
        super.imprimir();
    }
}
