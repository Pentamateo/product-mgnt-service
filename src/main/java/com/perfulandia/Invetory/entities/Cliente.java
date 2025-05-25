package com.perfulandia.Invetory.entities;
import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_cliente;
   private String nombre;
   private String correo;
   private String direccion;
   private String telefono;
   private String fecha_registro;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String correo, String direccion, String telefono, String fecha_registro) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_registro = fecha_registro;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fecha_registro='" + fecha_registro + '\'' +
                '}';
    }


    public void crearCuenta() {
        //Metodo para que el usuario pueda crear su cuenta
    }

    public void iniciarSesion() {
        //Metodo para iniciar sesion
    }

    public void agregarCarrito() {
        //El usuario podra agregar los productos a un carrito de compras
    }

    public void buscarProductos() {
        //Permite al usuario encontrar los productos por palabras clave
    }
}

