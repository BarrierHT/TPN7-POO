package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;

public class TarjetaCredito {

    public long numero;
    public LocalDate fechaCaducacion;
    public String nombreTitular;
    public long limiteCompra;

    public TarjetaCredito() {

    }

    public TarjetaCredito(long numero, LocalDate fechaCaducacion, String nombreTitular, long limiteCompra) {
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

    public long getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(long limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

	@Override
	public String toString() {
		return "\nNumero: " + numero + " Fecha De Caducacion: " + fechaCaducacion + "\nNombre Titular: "
				+ nombreTitular + ", Limite De Compra Actual:" + limiteCompra;
	}

}