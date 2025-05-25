package com.perfulandia.Invetory.entities;
import jakarta.persistence.*;

@Entity

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id_empleado;
    String nombre;
    String correo;
    String sucursal;
    String turno;
    String fecha_ingreso;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String correo, String sucursal, String turno, String fecha_ingreso) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.correo = correo;
        this.sucursal = sucursal;
        this.turno = turno;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado=" + id_empleado +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", turno='" + turno + '\'' +
                ", fecha_ingreso='" + fecha_ingreso + '\'' +
                '}';
    }

    public void registrarVenta() {
        //Permite al empleado registrar alguna venta
    }

    public void consultarInventario() {
        //Permite revisar el inventario, stock de productos, etc...
    }

    public void buscarProducto() {
        //Permite buscar un producto por su id
    }

    public void generarFcatura() {
        //Permite generar una factura por la venta hecha
    }
}
