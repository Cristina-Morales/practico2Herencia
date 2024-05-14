package org.example.clases;

public abstract class Apartamento extends Vivienda{

    public abstract double getValorm2();

    public Apartamento(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
