public class Bloque {
    protected String nombre;
    protected int resistencia;

    public Bloque(String nombre, int resistencia){
        this.nombre = nombre;
        this.resistencia = resistencia;
    }

    public void mostrarInfo(){
        System.out.println(nombre + "resistencia:" + resistencia)
    }
}

public class BloqueMadera extends Bloque{
    private String tipoMadera;

    public BloqueMadera(String nombre, int resistencia, String tipoMadera){
        super(nombre,resistencia);
        this.tipoMadera = tipoMadera;
    }
}