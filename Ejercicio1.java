/*
 ** Identifique:
 //1- Nombre de la clase
 //2- Constructor (¿está correcto?)
 //3- Atributos
 //4- Métodos (¿Son todos invocables desde afuera?) /scope
 5- ¿Qué hacer si quisiera obtener o cambiar un atributo desde fuera de la clase?
*/

public class Producto { //1. nommbre: producto
    // 3. Atributos
    private String nombre;
    private int precio;
    private int peso;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = 0;
    }

    public Producto(String nombre, int precio, int peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = 0;
    }

new Producto("",2,10);





    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
    }

    protected boolean esCaro() {
        return precio > 10000;
    }
}

public class Enlatados implements Producto{
    public void imprimirPeso(){}
}

Producto lataJurel = new Enlatados()
Producto jugoWhattss = new Enbotellados()

Enemigo enemy = new EnemigoAbeja();

// Persona persona1 = new Persona(nombre, edad);

int precioProducto;
String nombreProducto;
///input del usuario....
Producto arroz = new Producto(precioProducto, nombreProducto);
arroz.