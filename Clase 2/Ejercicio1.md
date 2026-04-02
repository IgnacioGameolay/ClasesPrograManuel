## Ejercicio 1 — Minecraft (Básico)

En el contexto del videojuego Minecraft, se desea modelar distintos tipos de bloques.

Se sabe que todos los bloques poseen un nombre y un nivel de resistencia.

Se pide:

--1. Definir una clase llamada `Bloque` que contenga:
   - Un atributo `nombre` de tipo String
   - Un atributo `resistencia` de tipo int

2. Implementar un constructor que inicialice ambos atributos.

3. Implementar un método llamado `mostrarInfo()` que imprima el nombre y la resistencia del bloque.

4. Definir una subclase llamada `BloqueMadera` que herede de `Bloque` y que además tenga:
   - Un atributo `tipoMadera` de tipo String

5. Implementar un constructor para `BloqueMadera` que inicialice todos sus atributos.

--6. En el método `main`, crear un objeto de tipo `BloqueMadera` y mostrar su información.