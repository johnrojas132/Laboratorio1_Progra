/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author efer0
 */
public class Tesis extends Material {
   
    // Atributos propios de la tesis
    private String autor;
    private String universidad;
    private int anioPublicacion;

    // Constructor
    public Tesis(int id,
                 String titulo,
                 String autor,
                 String universidad,
                 int anioPublicacion) {

        // Llama constructor de Material
        super(id, titulo);

        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }

    // Implementacion del metodo abstracto
    @Override
    public void mostrarInfo() {

        System.out.println("---- TESIS ----");
       // Datos heredados
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        
        System.out.println("Disponible: " + isDisponible());

        // Datos propios
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
