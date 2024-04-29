package tarea1;

/**
 * Esta clase abstracta presenta el modelo para organiazar e identificar
 * todos los productos que se ofrecen
 */
public abstract class Producto {
    int serie;

    /**
     * Este es el proceso de otorgar un numero de serie unico que permita identificar cada producto
     * @return serie, este retorno devuelve una serie unica representada por el espacio en memoria fisica
     * que ocupa el producto
     */
    public int getSerie(){
        return serie;
    }
    public abstract String Sonido();

}
