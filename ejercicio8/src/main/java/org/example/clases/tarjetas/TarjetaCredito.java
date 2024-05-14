package org.example.clases.tarjetas;

import org.example.clases.Banco;
import org.example.clases.Titular;

public class TarjetaCredito {
    Banco banco;
    int nroTarjeta;
    double saldo;
    Titular titular;

    public TarjetaCredito(Banco banco, int nroTarjeta, double saldo, Titular titular) {
        this.banco = banco;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
