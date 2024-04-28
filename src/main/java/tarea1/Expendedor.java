package tarea1;
public class Expendedor extends Exception {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Moneda> monVu;

    private int pB;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public static final int FANTA=3;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito<Producto>();
        for(int i=100;i<numBebidas+100;i++){
            Producto beo = new CocaCola(i);
            coca.add(beo);
        }
        sprite = new Deposito<Producto>();
        sprite = new Deposito();

        for(int i=200;i<numBebidas+200;i++){
            Producto beo = new Sprite(i);
            sprite.add(beo);
        }

        fanta = new Deposito<Producto>();

        for(int i=200;i<numBebidas+200;i++){
            Producto beo = new Fanta(i);
            fanta.add(beo);
        }
        monVu = new Deposito<Moneda>();

        pB=precioBebidas;
    }

    public Producto comprarBebida(Moneda m, int sabor) throws PagoInsuficienteExcepcion {
        if(m==null){return null;}

        Producto out = null;
        if(m.getValor()>=pB){
            if(sabor==COCA){
                out = coca.get();
            }
            if(sabor==SPRITE){
                out = sprite.get();
            }
            if(sabor==FANTA){
                out = fanta.get();
            }
        }
        if(m.getValor()>pB && out!=null){
            int vu=m.getValor()-pB;
            vu/=100;
            for(int i=0;i<vu;i++) {
                Moneda mon = new Moneda100();
                monVu.add(mon);
            }
        }
        if(m.getValor()<pB && out!=null){
            throw new PagoInsuficienteExcepcion("No se pudo completar la compra por pago induficiente.");
        }

        if(out==null){
            monVu.add(m);

        }
        return out;
    }

    public Moneda getVuelto(){
        return monVu.get();
    }
}
