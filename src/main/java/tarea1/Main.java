package tarea1;

/**
 * Este es un código que simula un expendedor de bebidas y dulces, creado para la clase POO (Programacion Orientada a Objetos)
 * @author Santiago Díaz, Mario Salgado & Luis Martinez
 */
public class Main {
    /**
     *
     * @param args es un array que recibe datos de la command line (no se usa en este caso)
     * @throws NoHayProductoException es una excepcion que permite a la maquina detectar cuando el stock de producto = 0
     * @throws PagoInsuficienteExcepcion una excepcion que permite saber cuando el dinero ingresado es menos al precio del producto
     * @throws PagoIncorrectoException cuando no se pudo concretar la transaccion.
     */
    public static void main(String[] args) throws NoHayProductoException,PagoInsuficienteExcepcion,PagoIncorrectoException{


        int numProductos = 1;
        int prodnum = 5;
        Expendedor exp = new Expendedor(numProductos);

        Moneda m = new Moneda1000();

        Comprador compa = null;
        m = new Moneda1000();
        try {
            compa = new Comprador(m, prodnum, exp);
        } catch (NoHayProductoException e) {
            System.out.println((e.getMessage()));
        } catch (PagoInsuficienteExcepcion e) {
            System.out.println((e.getMessage()));
        } catch (PagoIncorrectoException e) {
            System.out.println((e.getMessage()));
        }
        System.out.println(compa.queCompraste());
        System.out.println(compa.cuantoVuelto());

        Comprador compa2 = null;
        m = null;
        try {
            compa2 = new Comprador(m, prodnum, exp);
        } catch (NoHayProductoException e) {
            System.out.println((e.getMessage()));
        } catch (PagoInsuficienteExcepcion e) {
            System.out.println((e.getMessage()));
        } catch (PagoIncorrectoException e) {
            System.out.println((e.getMessage()));
        }

        Comprador compa3 = null;
        prodnum=1;
        m = new Moneda100();
        try {
            compa3 = new Comprador(m, prodnum, exp);
        } catch (NoHayProductoException e) {
            System.out.println((e.getMessage()));
        } catch (PagoInsuficienteExcepcion e) {
            System.out.println((e.getMessage()));
        } catch (PagoIncorrectoException e) {
            System.out.println((e.getMessage()));
        }
    }
}
