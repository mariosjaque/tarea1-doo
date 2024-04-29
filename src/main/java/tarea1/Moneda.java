package tarea1;

/**
 * Esta es una clase abstracta llamada "Moneda" que contiene
 * todos los tipos de moneda aceptados por la maquina
 */
public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){}
    public String getSerie() {
        return this.toString();
    }
    public abstract int getValor();

    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}