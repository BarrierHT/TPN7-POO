package ar.edu.unju.escmi.poo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionCredito;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionStock;

import ar.edu.unju.escmi.poo.models.Credito;

// import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;

import java.util.Collection;

public class CreditoTest { // ? Handle all Cuotas Troubles
    Credito credito;

    @BeforeEach
    void setUp() throws Exception {

        CollectionCliente.getClientes();
        // CollectionTarjetaCredito
        CollectionProducto.getProductos();
        CollectionFactura.getFacturas();
        CollectionCliente.getClientes();
        CollectionStock.getStocks();
        credito = CollectionCredito.creditos.get(0);
    }

    @AfterEach
    void tearDown() throws Exception {

    }
    /*
     * @Test
     * void testValidarListaCuotas() { // Validar lista cuotas no es null
     * 
     * bool band = true;
     * 
     * credito.getCuotas().stream().forEach(cuota -> {
     * if (!cuota) {
     * band = false;
     * break;
     * }
     * });
     * 
     * assertTrue(band);
     * 
     * }
     */
}
