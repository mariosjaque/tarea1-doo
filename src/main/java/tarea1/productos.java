package tarea1;

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
    public int valorProductos(){
        return valor;
    }
}
