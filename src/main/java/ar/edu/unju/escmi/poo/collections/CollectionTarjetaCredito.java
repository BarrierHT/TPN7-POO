package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Factura;
import ar.edu.unju.escmi.poo.models.Stock;
import ar.edu.unju.escmi.poo.models.TarjetaCredito;

public abstract class CollectionTarjetaCredito {
	 public static List<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();

	public CollectionTarjetaCredito() {
	}

	public static List<TarjetaCredito> getTarjetas() {
		return tarjetas;
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
