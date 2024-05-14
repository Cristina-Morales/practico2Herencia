package org.example.clases;

public abstract class Inmueble {
    int identificador;
    double area;
    String direccion;

    public void imprimir(){
        System.out.println("Identificador: " + identificador);
        System.out.println(   "Area:          " + area);
        System.out.println(   "Direccion:     " + direccion);
    }
    public abstract double getValorm2();
    public Inmueble(int identificador, double area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
