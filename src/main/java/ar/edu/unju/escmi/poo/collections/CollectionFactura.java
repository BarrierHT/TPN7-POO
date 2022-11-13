package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Factura;

public abstract class CollectionFactura {

    public static List<Factura> facturas = new ArrayList<Factura>();

    public CollectionFactura(List<Factura> facturas) {
        CollectionFactura.facturas = facturas;
    }

    public static List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        CollectionFactura.facturas = facturas;
    }

    public static void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public static Factura buscarFactura(int nroFactura) {
        Factura facturaEncontrada = null;
        if (facturas != null) {
            for (Factura fac : facturas) {
                if (fac.getNroFactura() == nroFactura) {
                    facturaEncontrada = fac;
                }
            }
        }
        return facturaEncontrada;
    }
}