package ar.edu.unju.escmi.poo.models;

public class Cliente {

    public long dni;
    public String nombre;
    public String apellido;
    public String direccion;
    public int telefono;
    public TarjetaCredito tarjeta;

    public Cliente() {

    }

    
    public Cliente(long dni, String nombre, String apellido, String direccion, int telefono, TarjetaCredito tarjeta) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tarjeta = tarjeta;
	}



	public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public TarjetaCredito getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}


	public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}