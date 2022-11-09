package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Credito;

public class CollectionCredito {

    public static List<Credito> creditos = new ArrayList<Credito>();

    public CollectionCredito() {

    }
    
    public static void getCreditos() {
    	if(creditos == null) {
    		creditos = new ArrayList<Credito>();
    		creditos.add(new Credito());
    		creditos.add(new Credito());
    		creditos.add(new Credito());
    		creditos.add(new Credito());
    	}
    }
    
    public static void setCreditos(List<Credito> creditos) {
        CollectionCredito.creditos = creditos;
    }

    
    
    public static void agregarCredito(Credito credito) {

        creditos.add(credito);
    }
}