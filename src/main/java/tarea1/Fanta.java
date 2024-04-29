package tarea1;

/**
 * Se agrega Fanta como un producto perteneciente a la clase Bebida
 */
public class Fanta extends Bebida {
    /**
     * @param serie permite darle a cada producto un identificador unico, esto se logra
     * usando el numero de espacio que ocupa en la memoria fisica
     */
    public Fanta(int serie) {
        super(serie);
    }
    /**
    * Se usa un override para heredar la interfaz de bebida y devolver el identificador del sabor fanta
    */
    @Override
    public String Sonido() {
        return "fanta";
    }
}

