package org.example.clases.tarjetas;

import org.example.clases.Banco;
import org.example.clases.Titular;

public class Visa extends  TarjetaCredito{


    public Visa(Banco banco, int nroTarjeta, double saldo, Titular titular) {
        super(banco, nroTarjeta, saldo, titular);
    }
}
