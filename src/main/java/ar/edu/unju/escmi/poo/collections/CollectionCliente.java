package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Cliente;

public class CollectionCliente {

    public static List<Cliente> clientes = new ArrayList<Cliente>();

    public CollectionCliente() {

    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        CollectionCliente.clientes = clientes;
    }

    public static void agregarCliente(Cliente cliente) {

        clientes.add(cliente);
    }

    public static Cliente buscarCliente(long dni) {
        Cliente clienteEncontrado = null;

        for (Cliente cli : clientes) {
            if (cli.getDni() == dni) {
                clienteEncontrado = cli;
            }
        }

        return clienteEncontrado;
    }
}
