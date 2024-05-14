package org.example.clases;

public class Cajero extends Empleado{


    public Cajero(String nombre, int dni, String domicilio, String fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    @Override
    public double getSalario() {
        return getSueldoBasico();
    }
}
