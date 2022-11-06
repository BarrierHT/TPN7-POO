package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;

public class Cuota {

    public double monto;
    public int nroCuota;
    public LocalDate fechaGeneracion;
    public LocalDate fechaVencimiento;

    public Cuota() {

    }

    public Cuota(double monto, int nroCuota, LocalDate fechaGeneracion, LocalDate fechaVencimiento) {
        this.monto = monto;
        this.nroCuota = nroCuota;
        this.fechaGeneracion = fechaGeneracion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
