package tarea1;

public class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "cocacola";
    }
}

