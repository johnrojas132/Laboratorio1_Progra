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
    private String autor;
    private int cantidadPaginas;
    
    
    public Libro(int id, String titulo, String autor, int cantidadPaginas){
        super(id, titulo);
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        
    }
    @Override
    public void mostrarInfo() {
        System.out.println("---- LIBRO ----");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + cantidadPaginas);
        
    }
    
}

