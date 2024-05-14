package org.example;

import org.example.clases.ConjuntoCerrado;
import org.example.clases.Oficina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yacuzzi");
        list.add("Piscina");
        list.add("Quincho");
        ConjuntoCerrado casaConjuntoCerrasdo = new ConjuntoCerrado(112564,212,"Libano 154",4,2,1232,list);
        Oficina oficina = new Oficina(546879,45,"Belgrano 504");

        System.out.println("Casa en conjunto cerrado");
        casaConjuntoCerrasdo.imprimir();
        System.out.println("Oficina");
        oficina.imprimir();




    }
}