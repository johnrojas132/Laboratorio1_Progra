# LAB_U2_Herencia_GitHub

## Descripción del proyecto

Este proyecto consiste en un sistema de biblioteca desarrollado en Java utilizando programación orientada a objetos. El sistema permite registrar distintos tipos de materiales como libros, revistas, tesis y audiolibros.

El objetivo principal es aplicar conceptos de herencia, polimorfismo, encapsulamiento, clases abstractas, uso de colecciones y manejo básico de excepciones.

---

## Funcionalidades del sistema

El sistema permite:

- Agregar libros
- Agregar revistas
- Agregar tesis
- Agregar audiolibros
- Listar todos los materiales registrados
- Buscar materiales por ID
- Prestar materiales
- Devolver materiales
- Mostrar el total de materiales registrados

---

## Tecnologías utilizadas

- Java
- NetBeans
- Git
- GitHub

---

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

- `Material.java` → Superclase abstracta del sistema
- `Libro.java` → Subclase de Material
- `Revista.java` → Subclase de Material
- `Tesis.java` → Subclase de Material
- `Audiolibro.java` → Subclase de Material
- `Biblioteca.java` → Manejo de materiales y lógica principal
- `Main.java` → Menú funcional en consola
- `Genero.java` → Enum utilizado en Libro
- `MaterialNoDisponibleException.java` → Excepción personalizada

---

## Conceptos aplicados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

- Clases y objetos
- Herencia
- Polimorfismo
- Encapsulamiento
- Clases abstractas
- Constructores
- Uso de `super` y `this`
- Colecciones con `ArrayList`
- Enumeraciones (`enum`)
- Miembros `static` y `final`
- Manejo de excepciones con `try-catch`

---

## Ejecución del proyecto

1. Abrir el proyecto en NetBeans
2. Ejecutar la clase `Main.java`
3. Utilizar el menú en consola para probar las opciones del sistema

---

## Integrantes

- Integrante 1
- Integrante 2
- Integrante 3
- Integrante 4

---

## Evidencia de herencia

Las clases `Libro`, `Revista`, `Tesis` y `Audiolibro` heredan de la clase abstracta `Material` mediante el uso de `extends`, reutilizando atributos y métodos comunes del sistema.
