package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.models.Producto;
import ar.edu.unju.escmi.poo.models.Stock;

public class CollectionStock {

    public static List<Stock> stocks = new ArrayList<Stock>();

    public CollectionStock(List<Stock> stocks) {
        CollectionStock.stocks = stocks;
    }

    public List<Stock> getStocks() {
        return stocks;
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