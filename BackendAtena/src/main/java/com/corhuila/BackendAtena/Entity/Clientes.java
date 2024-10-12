package com.corhuila.BackendAtena.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes extends ABaseEntity{

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "cedula", nullable = false)
    private Float cedula;

    @Column(name = "telefono", nullable = false)
    private Float telefono;

    @Column(name = "email", length = 100, nullable = false)
    private String email;


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

    public Float getTelefono() {
        return telefono;
    }

    public void setTelefono(Float telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
