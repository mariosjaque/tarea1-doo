package tarea1;
/**
 * Esta clase hereda la abstracta de Moneda y le otorga el valor de 1000
 */
public class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    @Override
    public int getValor() {
        return 1000;
    }
}
