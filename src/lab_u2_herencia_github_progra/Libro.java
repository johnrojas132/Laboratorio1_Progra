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

    // Atributos
    private String autor;
    private int cantidadPaginas;
    private Genero genero;

    // Constructor
    public Libro(int id,
                 String titulo,
                 String autor,
                 int cantidadPaginas,
                 Genero genero) {

        super(id, titulo);

        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }

    // Metodo sobrescrito
    @Override
    public void mostrarInfo() {

        System.out.println("===== LIBRO =====");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + cantidadPaginas);
        System.out.println("Genero: " + genero);
    }
}
