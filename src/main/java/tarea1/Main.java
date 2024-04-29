package tarea1;

public class Main {
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
