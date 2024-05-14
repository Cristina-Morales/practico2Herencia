package org.example.clases;

public class Independiente extends Casa{


    public Independiente(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
    }

    public double getValorm2() {
        return 2000000;
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }
    @Override
    public void imprimir() {
        System.out.println("Independiente");
        System.out.println(   "valor:        " + getValorInmueble());
        super.imprimir();
    }
}
