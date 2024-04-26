package tarea1;
public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Moneda> monVu;
    private int pB;
    public static final int COCA=1;
    public static final int SPRITE=2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito<Producto>();
        for(int i=100;i<numBebidas+100;i++){
            Bebida beo = new CocaCola(i);
            coca.add(beo);
        }
        sprite = new Deposito<Producto>();
        for(int i=200;i<numBebidas+200;i++){
            Bebida beo = new Sprite(i);
            sprite.add(beo);
        }
        monVu = new Deposito<Moneda>();
        pB=precioBebidas;
    }

    public Producto comprarBebida(Moneda m, int sabor){
        if(m==null){return null;}
        Producto out = null;
        if(m.getValor()>=pB){
            if(sabor==COCA){
                out = coca.get();
            }
            if(sabor==SPRITE){
                out = sprite.get();
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

        if(out==null){monVu.add(m);}
        return out;
    }

    public Moneda getVuelto(){
        return monVu.get();
    }
}
