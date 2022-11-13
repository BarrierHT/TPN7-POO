package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.poo.models.Cliente;
import ar.edu.unju.escmi.poo.models.Producto;
import ar.edu.unju.escmi.poo.models.Stock;

public abstract class CollectionStock {

    public static List<Stock> stocks = new ArrayList<Stock>();

    public CollectionStock(List<Stock> stocks) {
        CollectionStock.stocks = stocks;
    }

    public static void getStocks() {
    	 if (stocks == null) {
    		 stocks = new ArrayList<Stock>();
             stocks.add(new Stock(12,CollectionProducto.productos.get(0)));
             stocks.add(new Stock(22,CollectionProducto.productos.get(1)));
             stocks.add(new Stock(13,CollectionProducto.productos.get(2)));
             stocks.add(new Stock(101,CollectionProducto.productos.get(3)));
             stocks.add(new Stock(87,CollectionProducto.productos.get(4)));
             stocks.add(new Stock(45,CollectionProducto.productos.get(5)));
             stocks.add(new Stock(16,CollectionProducto.productos.get(6)));
             stocks.add(new Stock(8,CollectionProducto.productos.get(7)));
             stocks.add(new Stock(5,CollectionProducto.productos.get(8)));
             stocks.add(new Stock(21,CollectionProducto.productos.get(9)));
             stocks.add(new Stock(17,CollectionProducto.productos.get(10)));
             stocks.add(new Stock(11,CollectionProducto.productos.get(11)));
             stocks.add(new Stock(8,CollectionProducto.productos.get(12)));
             stocks.add(new Stock(14,CollectionProducto.productos.get(13)));
             stocks.add(new Stock(4,CollectionProducto.productos.get(14)));
             stocks.add(new Stock(15,CollectionProducto.productos.get(15)));
             stocks.add(new Stock(28,CollectionProducto.productos.get(16)));
             stocks.add(new Stock(47,CollectionProducto.productos.get(17)));
             stocks.add(new Stock(33,CollectionProducto.productos.get(18)));

    	 }
    }

    public void setStocks(List<Stock> stocks) {
        CollectionStock.stocks = stocks;
    }

    public static void agregarStock(Stock stock) {
        if (stocks.isEmpty()) {
            stocks.add(stock);
        } else {
            Producto controlProducto = stock.getProducto();
            boolean band = true;
            int i = 0;

            for (Stock sto : stocks) {
                if (band) {
                    if (controlProducto == sto.getProducto()) {
                        stocks.set(i, stock);
                        band = false;
                    }
                }
                i++;
            }
            if (band) {
                stocks.add(stock);
            }
        }
    }

    public static void reducirStock(Stock stock, int cantidad) {
        int i = stocks.indexOf(stock);
        if (i >= 0) {
            stock.setCantidad(stock.getCantidad() - cantidad);
            stocks.set(i, stock);
        } else {
            System.out.println("\nError");
        }
    }

    public static Stock buscarStock(Producto producto) {
        Stock stockTotal = null;
        if (stocks != null) {
            for (Stock sto : stocks) {
                if (sto.getProducto() == producto) {
                    stockTotal = sto;
                }
            }
        }
        return stockTotal;
    }
}