/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author Usuario
 */
public abstract class Material {
    // Atributos
    private final int id;                
    private String titulo;               
    private boolean disponible;          
    private static int contadorMateriales = 0; 

    // Constructor
    public Material(int id, String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio ");
        }
        this.id = id;
        this.titulo = titulo;
        this.disponible = true; 
        contadorMateriales++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio ");
        }
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // prestamo y devolucion
    public void prestar() throws MaterialNoDisponibleException {
        if (!disponible) {
            throw new MaterialNoDisponibleException("El material ya esta prestado ");
        }
        disponible = false;
        System.out.println("Material prestado correctamente ");
    }

    public void devolver() throws MaterialNoDisponibleException {
        if (disponible) {
            throw new MaterialNoDisponibleException("El material ya esta  disponible");
        }
        disponible = true;
        System.out.println("Material devuelto correctamente ");
    }

   
    public abstract void mostrarInfo();

    //para contar materiales
    public static int getContadorMateriales() {
        return contadorMateriales;
    }
}
