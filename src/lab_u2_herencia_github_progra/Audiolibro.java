/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author efer0
 */
public class Audiolibro extends Material {
   // Atributos propios del audiolibro
    private String narrador;
    private int duracionMinutos;

    // Constructor
   public Audiolibro(int id, String titulo,
            String narrador, int duracionMinutos) {

        // Llama constructor de Material
        super(id, titulo);

        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }

   // Implementacion del metodo abstracto
    @Override
    public void mostrarInfo() {

        System.out.println("---- AUDIOLIBRO ----");

         // Datos heredados
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());

        // Datos propios
        System.out.println("Narrador: " + narrador);
        System.out.println("Duracion: " + duracionMinutos + " minutos");
    }
}
