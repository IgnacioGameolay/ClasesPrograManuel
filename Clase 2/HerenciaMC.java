
abstract class Bloque {
    protected String nombre;
    protected int resistencia;

    public Bloque(String nombre, int resistencia){
        this.nombre = nombre;
        this.resistencia = resistencia;
    }

    protected void mostrarInfo(){
        System.out.println("Mi nombre es: "+ nombre + " resistencia: " + resistencia);
    }
}

class BloqueMadera extends Bloque{
    private String tipoMadera;

    public BloqueMadera(String nombre, int resistencia, String tipoMadera){
        super(nombre,resistencia);
        this.tipoMadera = tipoMadera;
    }

    @Override
    protected void mostrarInfo(){
        //super.mostrarInfo();
        System.out.println("Mi tipo de madera es: " + tipoMadera);
    }
}


class HerenciaMC{
    public static void main(String[] args){
        Bloque nuevoBloque = new BloqueMadera("Madera",2,"roble");
        //nuevoBloque.mostrarInfo();

        if (nuevoBloque instanceof BloqueMadera){
            System.out.println("nacio uun bloque madera");
        }
        if (nuevoBloque instanceof Bloque){
            System.out.println("nacio uun bloque comun y corriente");
        } 
    }


}