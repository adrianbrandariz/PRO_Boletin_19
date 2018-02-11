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
package pro_boletin_19;

import com.adrian.boletin19.Libreria;

/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin_19 {

    
    public static void main(String[] args) {
        
        Libreria lib = new Libreria();
        int op;
        
        do{
            op = lib.menu();
            switch(op){
                case 1: lib.mostrarLibros();
                    break;
                case 2: lib.añadirLibro();
                    break;
                case 3: lib.venderLibro();
                    break;
                case 4: lib.darBaja();
                    break;
                case 5: lib.mostrarLibroDeterminado();
                    break;
                case 6: if(op == 7 && op == 0)    
                    System.exit(0);
            }
        } while (op!=6); 
    }
    
}
