package org.example.clases;

public class Administrativo extends Empleado{

    boolean jornadaLaboralCompleta = true;
    int horasTrabajadas;
    public Administrativo(String nombre, int dni, String domicilio, String fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    @Override
    public double getSalario() {// 160hs son 20 dias laborales *8 horas de trabajo por dia
        return getSueldoBasico()*160 * getHorasTrabajadas();
    }

    public boolean isJornadaLaboralCompleta() {
        return jornadaLaboralCompleta;
    }

    public void setJornadaLaboralCompleta(boolean jornadaLaboralCompleta) {
        this.jornadaLaboralCompleta = jornadaLaboralCompleta;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}