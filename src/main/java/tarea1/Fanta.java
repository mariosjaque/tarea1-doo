package tarea1;
/**@IntelAthlon aquí creo una bebida extra llamada Fanta para usar en el expendedor*/
public class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie);
    }
/**Aqui hice un override para el sabor fanta*/
    @Override
    public String beber() {
        return "fanta";
    }
}

