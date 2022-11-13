package ar.edu.unju.escmi.poo.models;

public class Detalle {

    public int cantidad;
    public double importe;
    private Producto producto;

    public Detalle() {

    }

    public Detalle(int cantidad, double importe, Producto producto) {
        this.cantidad = cantidad;
        this.importe = importe;
        this.producto = producto;
        calcularImporte();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void calcularImporte() {
        this.setImporte(this.cantidad * this.producto.getPrecioUnitario());
    }

    @Override
    public String toString() {
        return "Producto: " + producto + " | Cantidad: " + cantidad + " | Importe: " + importe + "\n";
    }
}