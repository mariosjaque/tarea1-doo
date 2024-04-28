package tarea1;
abstract class Bebida extends Producto {

    public Bebida(int s){
        serie = s;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String sonido();

}