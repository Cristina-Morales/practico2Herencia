package org.example.clases;

public abstract class Casa extends Vivienda {

    public abstract double getValorm2();

    public Casa(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
    }
}
