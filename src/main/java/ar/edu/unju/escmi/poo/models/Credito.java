package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito {

    private TarjetaCredito tarjetaCredito;
    private Factura factura;
    private List<Cuota> cuotas = new ArrayList<Cuota>();
    private TarjetaCredito tarjeta;

    public Credito() {

    }

    public Credito(TarjetaCredito tarjetaCredito, Factura factura, List<Cuota> cuotas, TarjetaCredito tarjeta) {
        this.tarjetaCredito = tarjetaCredito;
        this.factura = factura;
        this.cuotas = cuotas;
        this.tarjeta = tarjeta;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Credito(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void generarCuotas() {
        double montoCuota = this.factura.calcularTotal() / 30;
        int nroCuota = 0;
        LocalDate currentDate = LocalDate.now();
        LocalDate auxDate = LocalDate.now();

        for (int i = 0; i < 30; i++) {
            nroCuota++;
            Cuota cuota = new Cuota();
            cuota.setMonto(montoCuota);
            cuota.setNroCuota(nroCuota);
            cuota.setFechaGeneracion(currentDate); // Only one generation date
            auxDate = auxDate.plusMonths(1);
            cuota.setFechaVencimiento(auxDate);
            cuotas.add(cuota);
        }

    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
}
