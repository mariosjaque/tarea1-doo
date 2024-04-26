package tarea1;
public class Expendedor extends Exception {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoM monVu;

    private int pB;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public static final int FANTA=3;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();

        for(int i=100;i<numBebidas+100;i++){
            Bebida beo = new CocaCola(i);
            coca.addBebida(beo);
        }
        sprite = new Deposito();

        for(int i=200;i<numBebidas+200;i++){
            Bebida beo = new Sprite(i);
            sprite.addBebida(beo);
        }
        fanta = new Deposito();

        for(int i=200;i<numBebidas+200;i++){
            Bebida beo = new Fanta(i);
            fanta.addBebida(beo);
        }
        monVu = new DepositoM();

        pB=precioBebidas;
    }

    public Bebida comprarBebida(Moneda m, int sabor) throws PagoInsuficienteExcepcion {
        if(m==null){return null;}
        Bebida out = null;
        if(m.getValor()>=pB){
            if(sabor==COCA){
                out = coca.getBebida();
            }
            if(sabor==SPRITE){
                out = sprite.getBebida();
            }
            if(sabor==FANTA){
                out = fanta.getBebida();
            }
        }
        if(m.getValor()>pB && out!=null){
            int vu=m.getValor()-pB;
            vu/=100;
            for(int i=0;i<vu;i++) {
                Moneda mon = new Moneda100();
                monVu.addMoneda(mon);
            }
        }
        if(m.getValor()<pB && out!=null){
            throw new PagoInsuficienteExcepcion("No se pudo completar la compra por pago induficiente.");
        }

        if(out==null){
            monVu.addMoneda(m);

        }
        return out;
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
