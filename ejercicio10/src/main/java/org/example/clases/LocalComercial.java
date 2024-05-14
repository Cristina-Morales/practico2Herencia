package org.example.clases;

public class LocalComercial extends UsoComercial{

    boolean esInterno;
    String centroComercial;

    public LocalComercial(int identificador, double area, String direccion, boolean esInterno, String centroComercial) {
        super(identificador, area, direccion);
        this.esInterno = esInterno;
        this.centroComercial = centroComercial;
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }
    public double getValorm2() {
        return 3000000;
    }

    @Override
    public void imprimir() {
        System.out.println("Local comercial");

        System.out.println(   "valor:            " + getValorInmueble());
        if (isEsInterno()) {
            System.out.println("Es un departamento interno");
        } else {
            System.out.println("No es un departamento interno");
        }
        System.out.println(   "Centro Comercial: " + getCentroComercial());
        super.imprimir();
    }

    public boolean isEsInterno() {
        return esInterno;
    }

    public void setEsInterno(boolean esInterno) {
        this.esInterno = esInterno;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
}
