package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.poo.models.Factura;
import ar.edu.unju.escmi.poo.models.Producto;
import ar.edu.unju.escmi.poo.models.Stock;
import ar.edu.unju.escmi.poo.models.TarjetaCredito;

public abstract class CollectionTarjetaCredito {
	 public static List<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();

	public CollectionTarjetaCredito(List<TarjetaCredito> tarjetas) {
		 CollectionTarjetaCredito.tarjetas = tarjetas;
	}

	public static void getTarjetas() {
		if (tarjetas == null) {
            tarjetas = new ArrayList<TarjetaCredito>();
            tarjetas.add(new TarjetaCredito(2342342,LocalDate.now(),"MARCOS",19));
            tarjetas.add(new TarjetaCredito(4458689,LocalDate.of(2030, 1, 15),"JUAN",35));
            tarjetas.add(new TarjetaCredito(8754566,LocalDate.of(20230, 4, 21),"PEDRO",7));
		}
	}

	public static void setTarjetas(List<TarjetaCredito> tarjetas) {
		CollectionTarjetaCredito.tarjetas = tarjetas;
	}
	
	 public static void agregarTarjetaCredito(TarjetaCredito tarjeta) {
		 tarjetas.add(tarjeta);
	    }

	    public static TarjetaCredito buscarTarjetaCreddito(long numero) {
	        TarjetaCredito tarjetaEncontrada = null;
	        if (tarjetas != null) {
	            for (TarjetaCredito tarjeta : tarjetas) {
	                if (tarjeta.getNumero() == numero) {
	                	tarjetaEncontrada = tarjeta;
	                }
	            }
	        }
	        return tarjetaEncontrada;
	    }
}
