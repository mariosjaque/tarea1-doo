package tarea1;
public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int pB;
    public static final int COCA=1;
    public static final int SPRITE=2;

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
        monVu = new DepositoM();
        pB=precioBebidas;
    }

    public Producto comprarBebida(Moneda m, int sabor){
        if(m==null){return null;}

        Producto out = null;
        if(sabor == 1 || sabor ==2 || sabor == 3 || sabor ==4){
            if(m.getValor()>=pB){
                if(sabor==COCA){
                    out = coca.getBebida();
                }
                if(sabor==SPRITE){
                    out = sprite.getBebida();
                }
            }
            else{return out;}
            if(m.getValor()>pB && out!=null){
                int vu=m.getValor()-pB;
                vu/=100;
                for(int i=0;i<vu;i++) {
                    Moneda mon = new Moneda100();
                    monVu.addMoneda(mon);
                }
            }

            if(out==null){monVu.addMoneda(m);}
            return out;
        }
        else{
            return out;
        }

    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
