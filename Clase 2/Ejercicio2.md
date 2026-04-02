## Ejercicio 2 — Minecraft (Avanzado)

En Minecraft existen distintos tipos de personajes con habilidades específicas.

Se desea modelar este comportamiento utilizando herencia.

Se pide:

1. Definir una clase base llamada `Personaje` que contenga:
   - Un atributo `nombre` de tipo String
   - Un atributo `vida` de tipo int

2. Implementar un constructor que inicialice ambos atributos.

3. Implementar un método llamado `recibirDanio(int cantidad)` que disminuya la vida del personaje.

4. Definir una subclase `Guerrero` que:
   - Herede de `Personaje`
   - Tenga un atributo `arma` de tipo String
   - Implemente un método `atacar(int danio)` que retorne un mensaje con el daño realizado

5. Definir una subclase `Mago` que:
   - Herede de `Personaje`
   - Tenga un atributo `mana` de tipo int
   - Implemente un método `lanzarHechizo()` que disminuya el mana en una cantidad fija

6. Sobreescribir el método `toString()` o crear un método `mostrarInfo()` en ambas subclases para mostrar su información.

7. En el método `main`, crear un objeto de cada tipo y demostrar el uso de sus métodos.