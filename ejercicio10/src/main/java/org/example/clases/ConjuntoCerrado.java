package org.example.clases;

import java.util.List;

public class ConjuntoCerrado extends Casa {
    double costoAdministrativo;
    List<String> areasComunes;

    public double getValorm2() {
        return 2500000;
    }

    public ConjuntoCerrado(int identificador, double area, String direccion, int nroHabitaciones, int nroBanos, double costoAdministrativo, List<String> areasComunes) {
        super(identificador, area, direccion, nroHabitaciones, nroBanos);
        this.costoAdministrativo = costoAdministrativo;
        this.areasComunes = areasComunes;
    }

    public double getValorInmueble(){
        return getValorm2()*getArea();
    }
    public String areasComunes(){
        String listastr ="";
        for (String areasComune : areasComunes) {
            listastr = listastr + areasComune;
            listastr = listastr + "  -  ";
        }
        return listastr;
    }

    @Override
    public void imprimir(){
        System.out.println("Conjunto cerrado");
        System.out.println(   "valor:          " + getValorInmueble());
        System.out.println(   "Gastos comunes: " + getCostoAdministrativo());
        System.out.println(   "Areas comunes:  " + areasComunes());
        super.imprimir();
    }

    public double getCostoAdministrativo() {
        return costoAdministrativo;
    }

    public void setCostoAdministrativo(double costoAdministrativo) {
        this.costoAdministrativo = costoAdministrativo;
    }

    public List<String> getAreasComunes() {
        return areasComunes;
    }

    public void setAreasComunes(List<String> areasComunes) {
        this.areasComunes = areasComunes;
    }
}
