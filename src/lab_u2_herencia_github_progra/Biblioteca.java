/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author Ethan Naranjo
 */
import java.util.ArrayList;

public class Biblioteca {

    // Lista de materiales
    private ArrayList<Material> materiales;

    // Constructor
    public Biblioteca() {

        materiales = new ArrayList<>();
    }

    // Agregar material
    public void agregarMaterial(Material material) {

        materiales.add(material);

        System.out.println("Material agregado correctamente.");
    }

    // Listar materiales
    public void listarMateriales() {

        if (materiales.isEmpty()) {

            System.out.println("No hay materiales registrados.");
            return;
        }

        System.out.println("\n===== LISTA DE MATERIALES =====");

        for (Material material : materiales) {

            material.mostrarInfo();

            System.out.println("----------------------------");
        }
    }

    // Buscar por ID
    public Material buscarPorId(int id) {

        for (Material material : materiales) {

            if (material.getId() == id) {

                return material;
            }
        }

        return null;
    }

    // Buscar por titulo
    public void buscarPorTitulo(String titulo) {

        boolean encontrado = false;

        for (Material material : materiales) {

            if (material.getTitulo().equalsIgnoreCase(titulo)) {

                material.mostrarInfo();

                encontrado = true;
            }
        }

        if (!encontrado) {

            System.out.println("No se encontro el material.");
        }
    }

    // Prestar material
    public void prestarMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {

            try {

                material.prestar();

            } catch (MaterialNoDisponibleException e) {

                System.out.println(e.getMessage());
            }

        } else {

            System.out.println("Material no encontrado.");
        }
    }

    // Devolver material
    public void devolverMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {

            try {

                material.devolver();

            } catch (MaterialNoDisponibleException e) {

                System.out.println(e.getMessage());
            }

        } else {

            System.out.println("Material no encontrado.");
        }
    }

    // Mostrar total de materiales
    public void mostrarTotalMateriales() {

        System.out.println("Total de materiales registrados: "
                + Material.getContadorMateriales());
    }
}