package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;

public class TarjetaDeCredito {

    public long numero;
    public LocalDate fechaCaducacion;
    public String nombreTitular;
    public double limiteCompra;

    public TarjetaDeCredito() {

    }

    public TarjetaDeCredito(long numero, LocalDate fechaCaducacion, String nombreTitular, double limiteCompra) {
        this.numero = numero;
        this.fechaCaducacion = fechaCaducacion;
        this.nombreTitular = nombreTitular;
        this.limiteCompra = limiteCompra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getFechaCaducacion() {
        return fechaCaducacion;
    }

    public void setFechaCaducacion(LocalDate fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }
}