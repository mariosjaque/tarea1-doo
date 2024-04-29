package tarea1;

/**
 * Se agrega Super8 como producto perteneciente a la clase Dulce
 */
public class Super8 extends Dulce{

    public Super8(int x){
        super(x);
    }
    /**
     * Se usa un override para heredar la interfaz de dulce y devolver el identificador del sabor super8
     */
    @Override
    public String Sonido(){
        return "super8";
    }
}
