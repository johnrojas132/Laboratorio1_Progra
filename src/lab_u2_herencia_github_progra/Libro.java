/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author Chess
 */
public class Libro extends Material {
    // Atributos propios del libro
    private String autor;
    private int cantidadPaginas;
    
     // Constructor
    public Libro(int id, String titulo,
            String autor, int cantidadPaginas) {
     // Llama constructor de Material
        super(id, titulo);

        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }
    // Implementacion del metodo abstracto
    @Override
    public void mostrarInfo() {

        System.out.println("---- LIBRO ----");

        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        // Datos propios del libro
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + cantidadPaginas);
    }
    
}

