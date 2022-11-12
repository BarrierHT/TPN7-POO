package ar.edu.unju.escmi.poo.dominio;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;
import ar.edu.unju.escmi.poo.models.Cliente;
import ar.edu.unju.escmi.poo.models.Detalle;
import ar.edu.unju.escmi.poo.models.Factura;
import ar.edu.unju.escmi.poo.models.TarjetaCredito;
import junit.framework.TestCase;

public class FacturaTest extends TestCase {

	private Factura factura;
	private List<Detalle> detalles;
	private Cliente cliente;
	TarjetaCredito tarjeta;

	@BeforeEach
	protected void setUp() throws Exception {

		CollectionCliente.getClientes();
		CollectionTarjetaCredito.getTarjetas();
		CollectionProducto.getProductos();
		CollectionFactura.getFacturas();

		factura = new Factura();
		detalles = new ArrayList<Detalle>();
		cliente = new Cliente();
		tarjeta = new TarjetaCredito();

		detalles.add(new Detalle());
		detalles.add(new Detalle());
		detalles.get(0).setImporte(15000);
		detalles.get(1).setImporte(10000);

	}

	@AfterEach
	protected void tearDown() throws Exception {

	}

	@Test
	void testCalcularMontoCreditoTotal() { // Calcular monto total de una factura, tomando en cuenta el limite de compra
											// de un cliente

//      cliente = CollectionCliente.buscarCliente(111111);

		tarjeta.setLimiteCompra(150000);

		cliente.setTarjeta(tarjeta);

		factura.setDetalles(detalles);
		factura.setNroFactura(1);
		double total = factura.calcularTotal();

		// total = tarjeta.getLimiteCompra() + 1;

		assertTrue(total > 0 && total <= 200000 && total <= cliente.getTarjeta().getLimiteCompra());

	}

	@Test
	void testCalcularTotalImporte() { // Calcular y comprobar que la suma de todos los importes de detalles es igual
										// [Done]
										// al total de la factura

		factura.setDetalles(detalles);
		factura.setNroFactura(1);
		double total = factura.calcularTotal(), totalDetails = 0;

		for (Detalle detalle : detalles) {
			// totalDetails += detalle.getImporte() + 1;
			totalDetails += detalle.getImporte();
		}
		assertTrue(total == totalDetails);
	}

}
