package ar.edu.unju.escmi.poo.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {

    public LocalDate fecha;
    public long nroFactura;
    private Cliente cliente;
    private List<Detalle> detalles = new ArrayList<Detalle>();

    public Factura() {

    }

    public Factura(LocalDate fecha, long nroFactura, Cliente cliente, Detalle detalles) {
        this.fecha = fecha;
        this.nroFactura = nroFactura;
        this.cliente = cliente;
        this.detalles = detalles;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Detalle getDetalles() {
        return detalles;
    }

    public void setDetalles(Detalle detalles) {
        this.detalles = detalles;
    }

    public double calcularTotal() {
        double total = 0;
        for (Detalle detalle : detalles) {
            total += detalle.getImporte();
        }
        return total;
    }
}