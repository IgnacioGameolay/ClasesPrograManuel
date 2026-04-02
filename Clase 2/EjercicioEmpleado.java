
class Empleado{
    protected String nombre;
    protected int sueldoBase;
    
    public Empleado(String nombre, int sueldoBase){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public int calcularSueldo(){
        return sueldoBase;
    }
}

class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre, int sueldoBase){
        super(nombre, sueldoBase);
    }

    @Override
    public int calcularSueldo(){
        return sueldoBase;
    }
}

class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas = 0;
    private int valorHora = 0;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, int valorHora){
        super(nombre,sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;

    }

    @Override
    public int calcularSueldo(){
        return (horasTrabajadas*valorHora);
    }
}


public class EjercicioEmpleado{
    public static void main(String[] args){
        Empleado e1 = new EmpleadoTiempoCompleto("Toy Cansado jefe", 500000);
        Empleado e2 = new EmpleadoPorHora("Pepe", 30, 30000);

        System.out.println("Yo gano: " + e1.calcularSueldo());
        System.out.println("Yo gano: " + e2.calcularSueldo());
    }
}


/*

5. Definir una subclase `EmpleadoPorHora` que:
   - Herede de `Empleado`
   - Tenga atributos `horasTrabajadas` (int) y `valorHora` (int)
   - Sobreescriba el método `calcularSueldo()` para calcular el sueldo en base a estos valores

*/