package tarea1;

/**
 * Esta clase hereda la abstracta de Moneda y le otorga el valor de 100
 */

public class Moneda100 extends Moneda {
    public Moneda100() {
        super();

    }

    @Override
    public int getValor() {
        return 100;

    }
}