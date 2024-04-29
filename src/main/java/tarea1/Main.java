package tarea1;

public class Main {
    public static void main(String[] args) throws NoHayProductoException,PagoInsuficienteExcepcion,PagoIncorrectoException{

        Expendedor exp = new Expendedor(2);

        Moneda m = new Moneda1000();
        Comprador compa = null;

        try{
            compa = new Comprador(m, 5, exp);
        }
        catch (NoHayProductoException e){
            System.out.println((e.getMessage()));
            System.exit(1);
        }
        catch (PagoInsuficienteExcepcion e){
            System.out.println((e.getMessage()));
            System.exit(1);
        }
        catch (PagoIncorrectoException e){
            System.out.println((e.getMessage()));
            System.exit(1);
        }
        System.out.println(compa.queCompraste());
        System.out.println(compa.cuantoVuelto());


    }
}