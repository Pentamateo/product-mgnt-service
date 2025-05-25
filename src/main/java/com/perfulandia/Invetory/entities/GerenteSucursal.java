package com.perfulandia.Invetory.entities;
import jakarta.persistence.*;

@Entity
public class GerenteSucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String password;
    private Long sucursalId;

    public GerenteSucursal() {}

    public GerenteSucursal(String nombre, String correo, String password, Long sucursalId) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.sucursalId = sucursalId;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Long getSucursalId() { return sucursalId; }
    public void setSucursalId(Long sucursalId) { this.sucursalId = sucursalId; }

    // Métodos específicos
    public void gestionarInventario() {
        // lógica de inventario
    }

    public void generarReportes() {
        // lógica de reportes
    }

    public void gestionarPedidos() {
        // lógica de pedidos
    }
}
