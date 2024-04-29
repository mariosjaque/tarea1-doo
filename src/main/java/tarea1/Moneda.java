package tarea1;
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