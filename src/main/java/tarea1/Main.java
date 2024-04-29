package tarea1;

public class Main {
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
