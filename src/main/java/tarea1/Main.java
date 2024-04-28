package tarea1;

public class Main {
    public static void main(String[] args) throws NoHayProductoException,PagoInsuficienteExcepcion,PagoIncorrectoException{


        try{
            Expendedor exp = new Expendedor(1,300);
        } catch (NoHayProductoException e) {
            System.out.println((e.getMessage()));
            System.exit(1);
        }
        Expendedor exp = new Expendedor(7,300);

        Moneda500 m = null;

        try{
            exp.comprarBebida(m,5);
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


    }
}