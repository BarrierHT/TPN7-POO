package ar.edu.unju.escmi.poo.dominio;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;
import ar.edu.unju.escmi.poo.models.Credito;
import ar.edu.unju.escmi.poo.models.Cuota;
import ar.edu.unju.escmi.poo.models.Detalle;
import ar.edu.unju.escmi.poo.models.Factura;
import junit.framework.TestCase;

public class CreditoTest extends TestCase { // ? Handle all Cuotas Troubles
	Credito credito;
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	protected void setUp() throws Exception {

		CollectionCliente.getClientes();
		CollectionTarjetaCredito.getTarjetas();
		CollectionProducto.getProductos();
		CollectionFactura.getFacturas();
		CollectionCliente.getClientes();
		CollectionStock.getStocks();
		// credito = CollectionCredito.creditos.get(0);
//        System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	protected void tearDown() throws Exception {
//    	System.setOut(standardOut);
	}

	@Test
	void testValidarListaCuotas() { // Validar lista cuotas no es null [done]

		List<Detalle> detalles = new ArrayList<Detalle>();
		detalles.add(new Detalle());
		detalles.add(new Detalle());
		detalles.get(0).setImporte(3.5);
		detalles.get(1).setImporte(5.5);

		Factura factura = new Factura();
		factura.setDetalles(detalles);

		credito = new Credito(null, factura, new ArrayList<Cuota>(), null);

		boolean band = true;

		for (Cuota cuota : credito.getCuotas()) { // Retornar bien cuotas con su total de la factura correspondiente

//			cuota = null;

			if (cuota == null) {
				band = false;
				break;
			}

		}

		assertTrue(band);
	}

}
