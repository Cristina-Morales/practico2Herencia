package org.example.clases;

public class Vendedor extends Empleado{

    double totalVentas;

    public Vendedor(String nombre, int dni, String domicilio, String fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    public double getSalario() {
        return getSueldoBasico() + totalVentas*0.5/100;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }
    public void sumarVenta(double nuevaVenta) {
        this.totalVentas = this.totalVentas + nuevaVenta;
    }

}
