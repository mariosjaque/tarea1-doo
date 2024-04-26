package tarea1;

public enum preciosProductos {
    COCACOLA(1000),
    FANTA(1200),
    SPRITE(1200),
    SNICKERS(500),
    SUPER8(300);

    private int valor;
    private preciosProductos (int valor){
        this.valor = valor;
    }

    public int valorProductos(){
        return valor;
    }

}
