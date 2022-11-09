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
    		productos.add(new Producto(1111,"Aire Acondicionado Split On/Off 2750W FC Hisense",20000,"Argentina"));
    		productos.add(new Producto(1112,"Aire Acondicionado Split On/Off 3400W FC Hisense",20000,"Argentina"));
    		productos.add(new Producto(1113,"Aire Acondicionado Split On/Off 3400W FC Philco",20000,"Argentina")); 
    		productos.add(new Producto(1114,"Aire Acondicionado AA Inverter 3000 FC BGH",20000,"Argentina")); 
    		productos.add(new Producto(2111,"Celular Galaxi A33 Samsung",20000,"Argentina"));
    		productos.add(new Producto(2112,"Celular L7 + Primer Black - RVA TCL",20000,"Argentina"));
    		productos.add(new Producto(2113,"Celular PANTALLA 5\" QUAD CORE 1RAM 32GB Alcatel",20000,"Argentina")); 
    		productos.add(new Producto(2114,"Celular QTEST NEGRO Quantum",20000,"Argentina")); 
    		productos.add(new Producto(3111,"Heladera Heladera con Freezer 317 lts blanca Columbia",20000,"Argentina"));
    		productos.add(new Producto(3112,"Heladera Heladera Ciclica Gafa",20000,"Argentina"));
    		productos.add(new Producto(3113,"Heladera Heladera No Frost Electrolux",20000,"Argentina")); 
    		productos.add(new Producto(3114,"Heladera Heladera Ciclica R600 Drean",20000,"Argentina")); 
    		productos.add(new Producto(4111,"Lavarropas Semi 7 Kgs Columbia",20000,"Argentina"));
    		productos.add(new Producto(4112,"Lavarropas Next 10.12 Pg Eco Drean",20000,"Argentina"));
    		productos.add(new Producto(4113,"Lavarropa 8514 Aurora",20000,"Argentina")); 
    		productos.add(new Producto(4114,"Lavarropas Silver 8.5 Kg LG",20000,"Argentina")); 
    		productos.add(new Producto(5111,"Televisor 50\" - ULTRA HD Smart LG",20000,"Argentina"));
    		productos.add(new Producto(5112,"Televisor Smart TV 4K 50´ Sist Operativo Vidaa Noblex",20000,"Argentina"));
    		productos.add(new Producto(5113,"Televisor Smart TV de 50\" Ultra HD borderless Android Philips",20000,"Argentina")); 
    		productos.add(new Producto(5114,"Televisor UHD 4K Smart TV Samsung",20000,"Argentina")); 
    	
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