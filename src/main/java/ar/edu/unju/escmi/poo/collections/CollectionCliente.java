package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Cliente;

public abstract class CollectionCliente {

    public static List<Cliente> clientes;

    public CollectionCliente(List<Cliente> clientes) {
        CollectionCliente.clientes = clientes;
    }

    public static void getClientes() {
        if (clientes == null) {
            clientes = new ArrayList<Cliente>();
            clientes.add(new Cliente(45085907, "Marcos", "Quinteros", "Las Heras 835", 65454686,
                    CollectionTarjetaCredito.tarjetas.get(0)));
            clientes.add(new Cliente(36865654, "Juan", "Perez", "Av. Boulevar 1200", 35185695,
                    CollectionTarjetaCredito.tarjetas.get(1)));
            clientes.add(new Cliente(111, "Pedro", "Caseres", "Jujuy 732", 38845224,
                    CollectionTarjetaCredito.tarjetas.get(2)));
        }
    }

    public static void setClientes(List<Cliente> clientes) {
        CollectionCliente.clientes = clientes;
    }

    public static void agregarCliente(Cliente cliente) {
    	
    	try {
    		clientes.add(cliente);
		} catch (Exception e) {
			System.out.println("\nNO SE PUEDE GUARDAR EL CLIENTE");
		}
        
    }

    public static Cliente buscarCliente(long dni) {
        Cliente clienteEncontrado = null;

        try {
        	for (Cliente cli : clientes) {
                if (cli.getDni() == dni) {
                    clienteEncontrado = cli;
                }
            }
		} catch (Exception e) {
			return null;
		}
        
        return clienteEncontrado;
    }
}
