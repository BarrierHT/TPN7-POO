package ar.edu.unju.escmi.poo.models;

public class Producto {

    public long codigo;
    public String descripcion;
    public double precioUnitario;
    public String origenFabriacion;

    public Producto() {

    }

    public Producto(long codigo, String descripcion, double precioUnitario, String origenFabriacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.origenFabriacion = origenFabriacion;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getOrigenFabriacion() {
        return origenFabriacion;
    }

    public void setOrigenFabriacion(String origenFabriacion) {
        this.origenFabriacion = origenFabriacion;
    }

}
