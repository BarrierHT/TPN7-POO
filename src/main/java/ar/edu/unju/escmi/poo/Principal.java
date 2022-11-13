package ar.edu.unju.escmi.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;
import ar.edu.unju.escmi.poo.models.Cliente;
import ar.edu.unju.escmi.poo.models.Detalle;
import ar.edu.unju.escmi.poo.models.Factura;
import ar.edu.unju.escmi.poo.models.Producto;
import ar.edu.unju.escmi.poo.models.Stock;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        CollectionTarjetaCredito.getTarjetas();
        CollectionCliente.getClientes();
        CollectionProducto.getProductos();
        CollectionStock.getStocks();
        long billNumber = 0;

        do {

            option = -1;

            System.out.println("\nMenu Principal");
            System.out.println("1- Realizar una venta");
            System.out.println("2- Revisar compras realizadas por el cliente (debe ingresar el DNI del cliente)");
            System.out.println("3- Mostrar lista de los electrodomesticos");
            System.out.println("4- Consultar stock");
            System.out.println("5- Salir");

            System.out.println("Ingrese su opcion: ");

            option = scanner.nextInt();

            if (option == 1) {

                System.out.println("\nIngrese DNI del cliente: ");
                long idCard = scanner.nextLong();

                Cliente client = CollectionCliente.buscarCliente(idCard);

                if (client != null) {

                    String op;
                    Factura bill = new Factura();
                    boolean generateBill = false;

                    do {

                        System.out.println("\nIngrese codigo del producto: ");
                        long code = scanner.nextLong();
                        Producto p = CollectionProducto.buscarProducto(code);

                        if (p != null) {

                            System.out.println("Producto: " + p.getDescripcion());
                            System.out.println("\nIngrese cantidad: ");
                            int cantidad = scanner.nextInt();

                            if (CollectionStock.buscarStock(p) != null) {

                                if (CollectionStock.buscarStock(p).getCantidad() >= cantidad) {

                                    Detalle details = new Detalle(cantidad, 0, p);

                                    bill.getDetalles().add(details);
                                    generateBill = true;

                                    Stock stock = CollectionStock.buscarStock(p);
                                    CollectionStock.reducirStock(stock, cantidad);

                                } else {

                                    System.out.println("\nNo hay stock disponible");

                                }

                            } else {

                                System.out.println("\nNo hay stock");

                            }

                        } else {

                            System.out.println("\nNo se encontro el producto");

                        }

                        System.out.println("\nAgregar mas productos? s/n: ");
                        op = scanner.next();

                    } while (op.equalsIgnoreCase("s"));

                    if (generateBill) {

                        bill.setFecha(LocalDate.now());
                        billNumber++;
                        bill.setNroFactura(billNumber);
                        bill.setCliente(client);

                        CollectionFactura.agregarFactura(bill);

                        System.out.println(bill);
                    } else {
                        System.out.println("\nOcurrio un error al generar la factura");
                    }

                } else {
                    System.out.println("\nNo se encontro el cliente");
                }

            } else if (option == 2) {

                System.out.println("\nIngrese el DNI del cliente:");
                long idCard = scanner.nextLong();

                Cliente client = CollectionCliente.buscarCliente(idCard);

                if (client != null) {
                    List<Factura> shoppingList = client.consultarCompras();
                    if (shoppingList != null) {
                        System.out.println("COMPRAS: \n"
                                + shoppingList.toString());
                    } else {
                        System.out.println("\nNo hay compras hechas por el cliente " + client.getNombre() + " "
                                + client.getApellido());
                    }
                } else
                    System.out.println("\nEl DNI ingresado no corresponde a ningun cliente");

            } else if (option == 3) {

                List<Producto> products = CollectionProducto.productos;

                for (Producto pro : products) {

                    // ToDo mostrar solo productos que tengan stock
                    // Stock stock = CollectionStock.buscarStock(pro);

                    System.out.println("\n" + pro.toString());
                }

            } else if (option == 4) {

                System.out.println("\nIngrese el codigo el producto:");
                long codigo = scanner.nextLong();

                Producto producto = CollectionProducto.buscarProducto(codigo);
                if (producto != null) {
                    Stock stock = CollectionStock.buscarStock(producto);
                    if (stock != null) {
                        System.out.println("\nEl stock del producto: " + stock.getProducto().getDescripcion()
                                + " es de: " + stock.getCantidad());
                    } else {
                        System.out.println("\nNo hay stock del producto");
                    }
                } else {
                    System.out.println("\nNo se encontro el producto");
                }

            } else if (option == 5) {

                System.out.println("\nHa salido correctamente del programa");
                break;

            } else
                System.out.println("\nOpcion incorrecta");

        } while (1 == 1);

        scanner.close();
    }
}