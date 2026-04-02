// Clase del objeto "Persona"
public class Ticket {
    // DEclarar las variables de la clase
    // En este caso son atributos
    // Importante:
    // Todos los atributos son variables, pero no todas las variables son atributos
    private String nombre;
    private int edad;

    private String id;
    private String asunto;
    // Auxiliar
    private int contador = 0;
    public int sumatoria;
    private int edad;

    // Constructor (¿Qué necesito para "Construir" a mi "Persona"?)
    public Ticket(String asunto) {
        // Atributos (¿Qué características tiene mi "Persona"?)
        this.id = 0;
        this.asunto = asunto;
        //Color... Altura... etc..
    }

    public void asignarID(){
        this.id = len(BDD_tickets)+1;
    }



Ticket t = new Ticket(asuntoUser);
t.asignarID();



    // Métodos (¿Qué puede hacer la clase "Persona"?)
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
.....
    public static int sumarHasta(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }


    // Main
    public static void main(String[] args) {

        //
        String nombre = "Asu";
        int edad = 22;
        int numero = 5;

        //
        System.out.println("=== Datos básicos ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Suma hasta " + numero + " = " + sumarHasta(numero));
...












        // Defino e Instancio un objeto de clase "Persona".
        Persona persona1 = new Persona(nombre, edad);
        Auto auto1 = new Auto();

        persona1.saludar();

        if (persona1.esMayorDeEdad()) {
            System.out.println("La persona sí es mayor de edad");
        }
    }
}