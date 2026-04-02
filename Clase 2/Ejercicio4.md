## Ejercicio 4 — Vida Real (Avanzado)

Se desea modelar el sistema de empleados de una empresa.

Todos los empleados tienen un nombre y un sueldo base.

Se pide:

1. Definir una clase base llamada `Empleado` que contenga:
   - Un atributo `nombre` de tipo String
   - Un atributo `sueldoBase` de tipo int

2. Implementar un constructor que inicialice ambos atributos.

3. Implementar un método llamado `calcularSueldo()` que retorne el sueldo base.

4. Definir una subclase `EmpleadoTiempoCompleto` que:
   - Herede de `Empleado`
   - No agregue nuevos atributos
   - Sobreescriba el método `calcularSueldo()` (puede retornar el mismo valor)

5. Definir una subclase `EmpleadoPorHora` que:
   - Herede de `Empleado`
   - Tenga atributos `horasTrabajadas` (int) y `valorHora` (int)
   - Sobreescriba el método `calcularSueldo()` para calcular el sueldo en base a estos valores

6. En el método `main`, crear al menos un objeto de cada tipo y mostrar el sueldo calculado.

7. (Opcional) Utilizar el operador `instanceof` para identificar el tipo de empleado.