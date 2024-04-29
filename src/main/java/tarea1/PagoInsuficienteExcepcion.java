package tarea1;

/**
 * La excepcion que permite devolver un super mensaje cuando el dinero ingresado es insuficiente para
 * poder efectuar la compra
 */
public class PagoInsuficienteExcepcion extends Exception {
    public PagoInsuficienteExcepcion(String mensaje) {

        super(mensaje);

    }
}
