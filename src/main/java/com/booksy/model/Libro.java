package com.booksy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * modelo de libro para la base de datos
 * guarda la informacion de cada libro
 */
@Document(collection = "libros")
public class Libro {

    @Id
    private String id;
    
    private String titulo;
    private String descripcion;
    private String imagen;
    private double precio;
    private String categoria;
    
    // constructor vacio para mongodb
    public Libro() {
        this.categoria = "General";
    }
    
    // constructor con parametros
    public Libro(String titulo, String descripcion, String imagen, double precio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.categoria = "General";
    }
    
    // getters y setters
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
