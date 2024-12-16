package com.bootcam.library.model;

import jakarta.persistence.*;

@Entity
@Table(name="Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String autores;
    private int isbn;
    private String generosLiterarios;
    private String description;

    public Book(String titulo, String autores, int isbn, String generosLiterarios,  String description ) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.generosLiterarios = generosLiterarios;
        this.description = description;
    }

    public Book() {
    }

    public String getGenerosLiterarios() {
        return generosLiterarios;
    }

    public void setGenerosLiterarios(String generosLiterarios) {
        this.generosLiterarios = generosLiterarios;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
