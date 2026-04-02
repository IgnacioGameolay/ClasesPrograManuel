// Clase del objeto "Persona"
public class Persona {
    // Defino las variables de la case
    // En este caso son atributos
    // Importante:
    // Todos los atributos son variables, pero no todas las variables son atributos
    private String nombre;
    private int edad;
    public int altura;

    // Constructor (¿Qué necesito para "Construir" a mi "Persona"?)
    public Persona(String nombre, int edad) {
        // Atributos (¿Qué características tiene mi "Persona"?)
        this.nombre = nombre;
        this.edad = edad;
        //ColorPelo... Altura... etc..
    }

    // Métodos (¿Qué puede hacer la clase "Persona"?)
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static int sumarHasta(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }


    // Main
    public static void main(String[] args) {
        String nombre = "Asu";
        int edad = 22;
        int numero = 5;

        System.out.println("=== Datos básicos ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Suma hasta " + numero + " = " + sumarHasta(numero));

        // Defino e Instancio un objeto de clase "Persona".
        Persona persona1 = new Persona(nombre, edad);
        persona1.saludar();

        if (persona1.esMayorDeEdad()) {
            System.out.println("La persona sí es mayor de edad");
        }
    }
}