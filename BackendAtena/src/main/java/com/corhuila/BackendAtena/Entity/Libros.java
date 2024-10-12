package com.corhuila.BackendAtena.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libros extends ABaseEntity{

    @Column(name = "titulo", length = 255, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 255, nullable = false)
    private String autor;

    @Column(name = "categoria", length = 100, nullable = false)
    private String categoria;

    @Column(name = "copias", nullable = false)
    private Integer copias;


    // Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

}
