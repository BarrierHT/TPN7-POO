package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Credito;

public abstract class CollectionCredito {

    public static List<Credito> creditos = new ArrayList<Credito>();

    public CollectionCredito(List<Credito> creditos) {
    	CollectionCredito.creditos = creditos;
    }

    public static List<Credito> getCreditos() {
    	return creditos;
    }

    public static void setCreditos(List<Credito> creditos) {
        CollectionCredito.creditos = creditos;
    }

    public static void agregarCredito(Credito credito) {
        
    	try {
    		creditos.add(credito);
		} catch (Exception e) {
			System.out.println("\nNO SE PUDE GUARDAR EL CREDITO");
		}
    	
    }
}