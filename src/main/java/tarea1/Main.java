package tarea1;

public class Main {
    public static void main(String[] args) throws Exception {
        Expendedor exp1 = new Expendedor(4, 1000);
        Moneda m = new Moneda100();
        try{
           Comprador c = new Comprador(m, 3, exp1);
        }
        catch(PagoInsuficienteExcepcion e){
            System.out.println("error");
        }
    }
}