package tarea1;

/**
 * Esta es una clase representativa del producto "Cocacola" extensión de Bebida, usando override y permitiendo tener ordenado su numero de serie
 * y stock disponible dentro de la maquina
 */
public class CocaCola extends Bebida {
    /**
     * @param serie permite darle a cada producto un identificador unico, esto se logra
     * usando el numero de espacio que ocupa en la memoria fisica
     */
    public CocaCola(int serie) {

        super(serie);
    }

    /**
     * @return devuelve el identificador propio de este sabor de bebida para hacerle saber al programa que
     * esta comsumiendo la persona
     */
    @Override
    public String Sonido() {

        return "cocacola";
    }
}

