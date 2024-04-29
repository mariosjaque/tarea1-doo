package tarea1;
/**
 * Esta clase hereda la abstracta de Moneda y le otorga el valor de 500
 */
public class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    @Override
    public int getValor() {
        return 500;

    }
}
