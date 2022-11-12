package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito {

    private TarjetaDeCredito tarjetaCredito;
    private Factura factura;
    private List<Cuota> cuotas = new ArrayList<Cuota>();
    private TarjetaDeCredito tarjeta;

    public Credito() {

    }

    public Credito(TarjetaDeCredito tarjetaCredito, Factura factura, List<Cuota> cuotas, TarjetaDeCredito tarjeta) {
        this.tarjetaCredito = tarjetaCredito;
        this.factura = factura;
        this.cuotas = cuotas;
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaDeCredito tarjetaCredito) {
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

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
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
