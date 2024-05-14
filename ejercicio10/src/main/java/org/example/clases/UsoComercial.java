package org.example.clases;

public abstract class UsoComercial extends Inmueble{

    public abstract double getValorm2();

    public UsoComercial(int identificador, double area, String direccion) {
        super(identificador, area, direccion);
    }
}
