package ar.edu.unju.escmi.poo.dominio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;
import ar.edu.unju.escmi.poo.models.Stock;
import junit.framework.TestCase;

public class ProductoTest extends TestCase {

	public Stock stock;

	@BeforeEach
	protected void setUp() throws Exception {

		CollectionTarjetaCredito.getTarjetas();
		CollectionCliente.getClientes();
		CollectionProducto.getProductos();
		CollectionStock.getStocks();
		stock = CollectionStock.stocks.get(0);
	}

	@AfterEach
	protected void tearDown() throws Exception {

	}

	@Test
	void testCalcularStockProducto() { // Validar la reduccion de stock un producto
		int firstQty = stock.getCantidad();
		CollectionStock.reducirStock(stock, 1);
//		stock.setCantidad(firstQty + 1);
//		fail(" foo: " + firstQty + " bar: " + stock.getCantidad());
		assertEquals(firstQty, stock.getCantidad() + 1);
	}

}
