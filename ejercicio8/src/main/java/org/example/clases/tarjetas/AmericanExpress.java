package org.example.clases.tarjetas;

import org.example.clases.Banco;
import org.example.clases.Titular;

public class AmericanExpress extends  TarjetaCredito{
    public AmericanExpress(Banco banco, int nroTarjeta, double saldo, Titular titular) {
        super(banco, nroTarjeta, saldo, titular);
    }
}
