package tarea1;

/**
 * Esta es una clase abstracta llamada "Moneda" que contiene
 * todos los tipos de moneda aceptados por la maquina
 */
abstract class Moneda {
    public Moneda(){}
    public String getSerie() {
        return this.toString();
    }
    public abstract int getValor();
}