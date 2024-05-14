package org.example.clases;

public class MonoAmbiente extends Apartamento{

    public MonoAmbiente(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
    }

    public double getValorm2() {
        return 1000000;
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }
    @Override
    public void imprimir() {
        System.out.println("Monoambiente");
        System.out.println(   "valor:        " + getValorInmueble());
        super.imprimir();
    }
}
