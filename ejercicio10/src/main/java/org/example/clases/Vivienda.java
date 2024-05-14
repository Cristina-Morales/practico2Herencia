package org.example.clases;

public abstract class Vivienda extends Inmueble {
    int nroHabitaciones;
    int nroBanos;
    public abstract double getValorm2();

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("habitaciones: "  + nroHabitaciones);
        System.out.println("Baños       : "  + nroBanos);
    }

    public Vivienda(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion);
        this.nroHabitaciones = nroHabitaciones;
        this.nroBanos = nroBanos;
    }

    public int getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(int nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }

    public int getNroBanos() {
        return nroBanos;
    }

    public void setNroBanos(int nroBanos) {
        this.nroBanos = nroBanos;
    }
}
