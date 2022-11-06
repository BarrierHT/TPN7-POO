package ar.edu.unju.escmi.poo.models;

public class Credito {

    private TarjetaDeCredito tarjetaCredito;
    private Factura factura;
    private Cuota cuotas;

    public Credito() {

    }

    public Credito(TarjetaDeCredito tarjetaCredito, Factura factura, Cuota cuotas) {
        this.tarjetaCredito = tarjetaCredito;
        this.factura = factura;
        this.cuotas = cuotas;
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

    public Cuota getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota cuotas) {
        this.cuotas = cuotas;
    }

    public int generarCuotas() {
        return 1;
    }
}
