package tarea1;

/**
 * Agrega la clase snickers como producto perteneciente a la clase dulce
 */
public class Snickers extends Dulce{

    public Snickers(int x){
        super(x);
    }
    /**
     * Se usa un override para heredar la interfaz de dulce y devolver el identificador del sabor snickers
     */
    @Override
    public String Sonido(){
        return "Snickers";
    }
}
