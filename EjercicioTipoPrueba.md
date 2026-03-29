**Enunciado:**

Se desea modelar un sistema simple de productos.

Defina una clase llamada `Producto` que represente un producto dentro de una tienda.
Cada producto debe tener un **nombre**, un **precio** y un **stock disponible**.

Se pide:

1. Definir los atributos de la clase con la visibilidad adecuada.
2. Implementar un constructor que reciba como parámetros el nombre, precio y stock, e inicialice correctamente los atributos.
3. Implementar un método llamado `mostrarInfo()` que imprima en pantalla el nombre, precio y stock del producto.
4. Implementar un método llamado `hayStock()` que retorne `true` si el stock es mayor a 0, y `false` en caso contrario.
5. Implementar un método llamado `vender(int cantidad)` que disminuya el stock en la cantidad indicada, solo si hay suficiente stock disponible.
6. _**Puntos por Estilo:**_
Implemente un método `aplicarDescuento(int porcentaje)` que reduzca el precio del producto según el porcentaje indicado.

Tips:

> Identificar: Entidades, Clases, Atributos, y métodos.
> Definir y diseñar plan de acción
> Con todo listo, empezamos a programar