package org.example.clases;

public class Repartidor extends Empleado{
    int repartosRealizado;

    public Repartidor(String nombre, int dni, String domicilio, String fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    public void agregarReparto(){
        repartosRealizado ++;
    }

    public void reiniciarMes(){
        repartosRealizado = 0;
    }

    @Override
    public double getSalario() {
        return getSueldoBasico() + repartosRealizado * 500;
    }
}