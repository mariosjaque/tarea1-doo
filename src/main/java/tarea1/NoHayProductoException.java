package tarea1;

/**
 * La excepcion que permite devolver un super mensaje cuando no hay stock
 */
public class NoHayProductoException extends Exception{

    public NoHayProductoException(String Mensaje){
        super(Mensaje);
    }
}
