package org.example;

import org.example.clases.Administrativo;
import org.example.clases.Cajero;
import org.example.clases.Repartidor;
import org.example.clases.Vendedor;

public class Main {
    public static void main(String[] args) {
        Administrativo admin;
        Cajero cajero;
        Repartidor repartidor;
        Vendedor vendedor;

        admin = new Administrativo("Juan Perez", 12345678, "Alem 1015", "11-11-11");
        cajero = new Cajero("Ruben", 156785256, "Zapiola123", "12-5-2020");
        repartidor = new Repartidor("Yolanda", 54583684,"Don Bosco 554", "15-12-2023");
        vendedor = new Vendedor("Romina", 15985644, "Avellaneda 1231", "25-5-2005");
        vendedor.setTotalVentas( 15151515);

        for (int i =0; i<9545; i++){
            repartidor.agregarReparto();
        }
        admin.setHorasTrabajadas(154);

        System.out.println("El sueldo de nuestro Administrador " + admin.getNombre() + " es " + admin.getSalario() );
        System.out.println("El sueldo de nuestro cajero " + cajero.getNombre() + " es " + cajero.getSalario() );
        System.out.println("El sueldo de nuestro repartidor " + repartidor.getNombre() + " es " + repartidor.getSalario() );
        System.out.println("El sueldo de nuestro vendedor " + vendedor.getNombre() + " es " + vendedor.getSalario() );

    }
}