package org.example.clases;

import org.example.clases.tarjetas.TarjetaCredito;

public class Posnet {

    TarjetaCredito tc;

    public Posnet() {
    }

    boolean validarSaldo(double valor){
        return true;
    }

    public void leerTarjeta(TarjetaCredito tarjeta){
        this.tc = tarjeta;
    }
    public double calcularPagoTotal(double monto, int cuotas) {
        double montoActualizado;
        if (cuotas < 1 || cuotas > 6) {
            return 0;
        }
        return (monto + ((cuotas - 1) * 3) * monto / 100);
    }
    public String efectuarPago(double monto, int cuotas){
        double montoActualizado;
        if (cuotas<1 || cuotas >6){
            return "cuotas no esta entre 1 y 6";
        }
        montoActualizado = monto + ((cuotas-1)*3)*monto/100;

        if (validarSaldo(monto))
            return "no dispone de saldo suficiente";

        return "exito";
    }



}
