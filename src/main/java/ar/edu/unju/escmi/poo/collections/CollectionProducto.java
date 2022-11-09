package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Credito;
import ar.edu.unju.escmi.poo.models.Producto;

public class CollectionProducto {

    public static List<Producto> productos  = new ArrayList<Producto>();

    public CollectionProducto(List<Producto> productos) {
        CollectionProducto.productos = productos;
    }

    public static void getProductos() {
    	if(productos == null) {
    		productos  = new ArrayList<Producto>();
    		productos.add(new Producto(1111,"Heladera",20000,"Argentina"));
    		productos.add(new Producto(1111,"Heladera",20000,"Argentina"));
    		productos.add(new Producto(1111,"Heladera",20000,"Argentina")); 
    		productos.add(new Producto(1111,"Heladera",20000,"Argentina")); 
    	}
    }

    public void setProductos(List<Producto> productos) {
        CollectionProducto.productos = productos;
    }

    public static void agregarProducto(Producto producto) {
        if (productos.isEmpty()) {
            productos.add(producto);
        } else {
            long controlCodigo = producto.getCodigo();
            boolean band = true;

            for (Producto pro : productos) {
                if (band) {
                    if (pro.getCodigo() == controlCodigo) {
                        System.out.println("\nYa existe un producto con ese codigo");
                        band = false;
                    }
                }
            }
            if (band) {
                productos.add(producto);
            }

        }
    }

    public static Producto buscarProducto(int codigo) {
        Producto productoEncontrado = null;
        if (!productos.isEmpty()) {
            for (Producto pro : productos) {
                if (pro.getCodigo() == codigo) {
                    productoEncontrado = pro;
                }
            }
        }
        return productoEncontrado;
    }
}