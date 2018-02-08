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

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author abrandarizdominguez
 */
public class Libreria {
    
    ArrayList<Libros> libreria = new ArrayList<>();
    
    public Libreria(){
        
    }
    
    public int menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "**** MENU ****\n"
                + "1) Número de correos\n"
                + "2) Añadir correo\n"
                + "3) Detectar correos sin leer\n"
                + "4) Mostrar primer correo no leído\n"
                + "5) Mostrar correo de una posición\n"
                + "6) Elimina un correo concreto (posición)\n"
                + "7) Salida"));
        return opcion;
    }
    
    public void añadirLibro(){
        // Libros(String titulo, String autor, String isbn, float precio, int unidades)
        String titulo = JOptionPane.showInputDialog("Título del libro: ");
        String autor = JOptionPane.showInputDialog("Autor del libro: ");
        String isbn = JOptionPane.showInputDialog("Nº ISBN: ");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del libro: "));
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades del libro: "));
        libreria.add(new Libros(titulo, autor, isbn, precio, unidades));
    }
    
    public void mostrarLibros(){
        if (libreria.size() >= 1){
            Collections.sort(libreria);
            for (Libros ex: libreria){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay libros para mostrar");
        }
    }
}
