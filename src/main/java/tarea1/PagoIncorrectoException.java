package tarea1;
/**
 * La excepcion que permite devolver un super mensaje cuando hubieron
 * problemas con el pago y no se pudo realizar
 */
public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
}
