package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.poo.models.TarjetaCredito;

public abstract class CollectionTarjetaCredito {
	public static List<TarjetaCredito> tarjetas;

	public CollectionTarjetaCredito(List<TarjetaCredito> tarjetas) {
		CollectionTarjetaCredito.tarjetas = tarjetas;
	}

	public static void getTarjetas() {
		if (tarjetas == null) {
			tarjetas = new ArrayList<TarjetaCredito>();
			tarjetas.add(new TarjetaCredito(2342342, LocalDate.now(), "MARCOS", 600000));
			tarjetas.add(new TarjetaCredito(4458689, LocalDate.of(2030, 1, 15), "JUAN", 600000));
			tarjetas.add(new TarjetaCredito(8754566, LocalDate.of(2030, 4, 21), "PEDRO", 600000));
		}
	}

	public static void setTarjetas(List<TarjetaCredito> tarjetas) {
		CollectionTarjetaCredito.tarjetas = tarjetas;
	}

	public static void agregarTarjetaCredito(TarjetaCredito tarjeta) {
		
		try {
			tarjetas.add(tarjeta);
		} catch (Exception e) {
			System.out.println("\nNO SE PUEDE GUARDAR LA TARJETA DE CREDITO");
		}
		
	}

	public static TarjetaCredito buscarTarjetaCreddito(long numero) {
		TarjetaCredito tarjetaEncontrada = null;
		
		try {
			if (tarjetas != null) {
				for (TarjetaCredito tarjeta : tarjetas) {
					if (tarjeta.getNumero() == numero) {
						tarjetaEncontrada = tarjeta;
					}
				}
			}
		} catch (Exception e) {
			return null;
		}
		
		return tarjetaEncontrada;
	}
}
