package tarea1;

/**
 * Utillizando un enum se representa todos los productos ofrecidos
 * y su valor de tipo int para calculos de vuelto
 */
public enum productos {
    COCA(1000),
    SPRITE(1200),
    FANTA(1200),
    SNICKERS(500),
    SUPER8(300);

    private int valor;
    private productos (int valor){
        this.valor = valor;
    }

    /**
     * Para conocer el valor del producto
     * @return valor: retorna el valor del producto segun el numero indicado
     */
    public int valorProductos(){
        return valor;
    }
}
