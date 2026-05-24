/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author Chess
 */
public class Revista extends Material {
     private int numeroEdicion;
    private String mesPublicacion;

    public Revista(int id, String titulo, int numeroEdicion, String mesPublicacion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Edicion: " + numeroEdicion);
        System.out.println("Mes: " + mesPublicacion);
    }
}
