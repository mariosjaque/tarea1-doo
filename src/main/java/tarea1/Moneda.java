package tarea1;
abstract class Moneda {
    public Moneda(){}
    public String getSerie() {
        return this.toString();
    }
    public abstract int getValor();
}