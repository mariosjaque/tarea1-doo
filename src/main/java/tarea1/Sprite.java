package tarea1;

/**
 * Se agrega como producto la clase Sprite perteneciente a la clase Bebida
 */
public class Sprite extends Bebida {
    /**
     * @param serie permite darle a cada producto un identificador unico, esto se logra
     * usando el numero de espacio que ocupa en la memoria fisica
     */
    public Sprite(int serie) {
        super(serie);
    }
    /**
     * Se usa un override para heredar la interfaz de bebida y devolver el identificador del sabor sprite
     */
    @Override
    public String Sonido() {
        return "sprite";
    }
}
