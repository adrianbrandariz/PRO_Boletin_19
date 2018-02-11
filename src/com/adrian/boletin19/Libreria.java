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
                + "1) Mostrar libros\n"
                + "2) Añadir libro\n"
                + "3) Vender libro\n"
                + "4) Dar de baja libros\n"
                + "5) Consultar un libro determinado\n"
                + "6) Exit"));
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
    
    public void mostrarLibroDeterminado(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición: ")) - 1;
        String libro = libreria.get(posicion).toString();
        JOptionPane.showMessageDialog(null, libro);
    }
    
    public void darBaja() {
        for (int i=0; i<libreria.size(); i++){
            if (libreria.get(i).getUnidades() == 0){
                libreria.remove(i);
            }
        }
    }
    
    public void venderLibro(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué libro se ha vendido?")) - 1;
        libreria.remove(posicion);
        JOptionPane.showConfirmDialog(null, "Libro vendido.");
    }
}
