package com.corhuila.BackendAtena.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios extends ABaseEntity{

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "cedula", nullable = false)
    private Float cedula;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "clave", length = 100, nullable = false)
    private String clave;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private Rol roles = Rol.administrador;
    public enum Rol {
        administrador,
        trabajador
    }


    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCedula() {
        return cedula;
    }

    public void setCedula(Float cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRoles() {
        return roles;
    }

    public void setRoles(Rol roles) {
        this.roles = roles;
    }
}

