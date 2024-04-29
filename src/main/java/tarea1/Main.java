package tarea1;

/**
 * Este es un código que simula un expendedor de bebidas y dulces, creado para la clase POO (Programacion Orientada a Objetos)
 * @author Santiago Díaz, Mario Salgado & Luis Martinez
 */
public class Main {
    /**
     *
     * @param args es un array que recibe datos de la command line
     * @throws NoHayProductoException es una excepcion que permite a la maquina detectar cuando el stock de producto = 0
     * @throws PagoInsuficienteExcepcion una excepcion que permite saber cuando el dinero ingresado es menos al precio del producto
     * @throws PagoIncorrectoException cuando no se pudo concretar la transaccion.
     */
    public static void main(String[] args) throws NoHayProductoException,PagoInsuficienteExcepcion,PagoIncorrectoException{


        int numProductos = 1;
        int prodnum = 5;
        int cualProducto = 1;
        try{
            Expendedor exp = new Expendedor(numProductos);
        } catch (NoHayProductoException e) {
            System.out.println((e.getMessage()));
            System.exit(1);
        }
        Expendedor exp = new Expendedor(numProductos);

        Moneda500 m = null;

        try {
            exp.comprarProducto(m, prodnum);
            Comprador compa = null;

            try {
                compa = new Comprador(m, 5, exp);
            } catch (NoHayProductoException e) {
                System.out.println((e.getMessage()));
                System.exit(1);
            } catch (PagoInsuficienteExcepcion e) {
                System.out.println((e.getMessage()));
                System.exit(1);
            } catch (PagoIncorrectoException e) {
                System.out.println((e.getMessage()));
                System.exit(1);
            }
            Comprador comp = new Comprador(m, cualProducto, exp);
            System.out.println(compa.queCompraste());
            System.out.println(compa.cuantoVuelto());

    }
}