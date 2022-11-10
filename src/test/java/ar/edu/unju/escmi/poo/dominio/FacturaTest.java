package test.java.ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionStock;

import ar.edu.unju.escmi.poo.models.Factura;
import ar.edu.unju.escmi.poo.models.Detalle;
import ar.edu.unju.escmi.poo.models.Cliente;

public class FacturaTest {

    private Factura factura;
    private List<Detalle> detalles;
    private Cliente cliente;

    @BeforeEach
    void setUp() throws Exception {

        CollectionCliente.getClientes();
        CollectionProducto.getProductos();

    }

    @AfterEach
    void tearDown() throws Exception {

    }

    @Test
    void testCalcularMontoCreditoTotal() { // Calcular monto total de una factura
        cliente = CollectionCliente.buscarCliente(111111);
        detalles.add(new Detalle());
        detalles.add(new Detalle());

        factura.setDetalles(detalles);
        factura.setFecha(LocalDate.now());
        factura.setNroFactura(1);
        double total = factura.calcularTotal();

        assertTrue(total > 0 && total <= 200000 && total <= cliente.getTarjetaCredito.getLimiteCompra());

    }

    @Test
    void testCalcularTotalImporte() { // ToDo Calcular y comprobar que la suma de todos los importes de detalles es
                                      // igual al total de la factura

    }
}
