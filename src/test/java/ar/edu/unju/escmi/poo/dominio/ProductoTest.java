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
import junit.framework.TestCase;

public class ProductoTest extends TestCase{
    @BeforeEach
	protected
    void setUp() throws Exception {

        CollectionCliente.getClientes();
        CollectionProducto.getProductos();
        CollectionStock.getStocks();
    }

    @AfterEach
	protected
    void tearDown() throws Exception {

    }

    @Test
    void testCalcularStockProducto() { // ToDo Validar la reduccion y aumento de stock un producto
    	assertEquals(1,2);
    }

 
}
