package com.perfulandia.Invetory.entities;

import jakarta.persistence.*;

@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String password;

    public Administrador() {}

    public Administrador(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
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

    // Métodos específicos
    public void gestionarUsuarios() {
        // lógica para crear, actualizar o eliminar usuarios
    }

    public void asignarPermisos() {
        // lógica para asignar permisos
    }

    public void respaldarDatos() {
        // lógica de backup
    }

    public void restaurarDatos() {
        // lógica de restauración
    }
}
