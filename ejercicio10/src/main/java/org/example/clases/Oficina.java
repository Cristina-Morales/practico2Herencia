package org.example.clases;

public class Oficina extends UsoComercial{

    public Oficina(int identificador, double area, String direccion) {
        super(identificador, area, direccion);
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }

    @Override
    public void imprimir() {
        System.out.println("Oficina");
        System.out.println(   "valor:        " + getValorInmueble());
        super.imprimir();
    }

    public double getValorm2() {
        return 2400000;
    }

}
