/*
 * Realiza un programa para llevar el mantenimiento de una librería. Para eso:
 * 1- Realiza un diagrama de clases que refleje las relaciones entre las clases
 * y luego implementa el programa teniendo en cuenta:
 * Cada libro de llevar: título , autor, ISBN (String), precio y número de unidades.
 * El programa debe:
    • Añadir libros.
    • Vender (borrar) libros.
    • Mostrar los libros que tenemos (Los libros deben estar ordenados por el campo título).
    • Dar de baja los libros con número de unidades = 0.
    • Consultar un libro determinado.
 * En los métodos vender, mostrar, bajas y consultar debes comprobar que 
 * el array recibido no es null. En caso contrario lanza una excepción.
 * Para la clase aplicación utiliza un paquete y para las demás otro paquete.
 * En la aplicación del programa utiliza un menú con todas las opciones.
 */
package com.adrian.boletin19;

/**
 *
 * @author abrandarizdominguez
 */
public class Libros implements Comparable {

    private String titulo, autor, isbn;
    private float precio;
    private int unidades;

    // Constructor por defecto:
    public Libros() {
    }

    // Constructor por parámetros:
    public Libros(String titulo, String autor, String isbn, float precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.unidades = unidades;
    }

    // SETS Y GETS:
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    // Método "toString"
    public String toString() {
        return "Libro:\n" + "Título:" + titulo + "\nAutor:" + autor + "\nISBN:" + isbn + "\nPrecio:" + precio + "\nUnidades:" + unidades;
    }

    @Override
    // Método "compareTo":
    public int compareTo(Object c) {
        Libros lib = (Libros) c;
        if (titulo.compareToIgnoreCase(lib.getTitulo()) > 0) {
            return 1;
        } else if (titulo.compareToIgnoreCase(lib.getTitulo()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
