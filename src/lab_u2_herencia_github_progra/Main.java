/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github_progra;

/**
 *
 * @author Ethan Naranjo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcion;

        do {

            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar revista");
            System.out.println("3. Agregar tesis");
            System.out.println("4. Agregar audiolibro");
            System.out.println("5. Listar materiales");
            System.out.println("6. Buscar material por ID");
            System.out.println("7. Prestar material");
            System.out.println("8. Devolver material");
            System.out.println("9. Mostrar total de materiales");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // AGREGAR LIBRO
                case 1:

                    System.out.print("ID: ");
                    int idLibro = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloLibro = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Cantidad de paginas: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();

                    Libro libro = new Libro(
                            idLibro,
                            tituloLibro,
                            autor,
                            paginas,
                            Genero.PROGRAMACION
                    );

                    biblioteca.agregarMaterial(libro);

                    break;

                // AGREGAR REVISTA
                case 2:

                    System.out.print("ID: ");
                    int idRevista = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloRevista = sc.nextLine();

                    System.out.print("Numero de edicion: ");
                    int edicion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mes de publicacion: ");
                    String mes = sc.nextLine();

                    Revista revista = new Revista(
                            idRevista,
                            tituloRevista,
                            edicion,
                            mes
                    );

                    biblioteca.agregarMaterial(revista);

                    break;

                // AGREGAR TESIS
                case 3:

                    System.out.print("ID: ");
                    int idTesis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloTesis = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorTesis = sc.nextLine();

                    System.out.print("Universidad: ");
                    String universidad = sc.nextLine();

                    System.out.print("Año de publicacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    Tesis tesis = new Tesis(
                            idTesis,
                            tituloTesis,
                            autorTesis,
                            universidad,
                            anio
                    );

                    biblioteca.agregarMaterial(tesis);

                    break;

                // AGREGAR AUDIOLIBRO
                case 4:

                    System.out.print("ID: ");
                    int idAudio = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloAudio = sc.nextLine();

                    System.out.print("Narrador: ");
                    String narrador = sc.nextLine();

                    System.out.print("Duracion en minutos: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    Audiolibro audiolibro = new Audiolibro(
                            idAudio,
                            tituloAudio,
                            narrador,
                            duracion
                    );

                    biblioteca.agregarMaterial(audiolibro);

                    break;

                // LISTAR MATERIALES
                case 5:

                    biblioteca.listarMateriales();

                    break;

                // BUSCAR MATERIAL POR ID
                case 6:

                    System.out.print("Ingrese el ID del material: ");
                    int buscar = sc.nextInt();

                    Material encontrado = biblioteca.buscarPorId(buscar);

                    if (encontrado != null) {

                        encontrado.mostrarInfo();

                    } else {

                        System.out.println("Material no encontrado.");
                    }

                    break;

                // PRESTAR MATERIAL
                case 7:

                    System.out.print("Ingrese el ID del material a prestar: ");
                    int prestar = sc.nextInt();

                    biblioteca.prestarMaterial(prestar);

                    break;

                // DEVOLVER MATERIAL
                case 8:

                    System.out.print("Ingrese el ID del material a devolver: ");
                    int devolver = sc.nextInt();

                    biblioteca.devolverMaterial(devolver);

                    break;

                // MOSTRAR TOTAL DE MATERIALES
                case 9:

                    biblioteca.mostrarTotalMateriales();

                    break;

                // SALIR
                case 10:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 10);

        sc.close();
    }
}