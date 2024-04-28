package tarea1;
public class Expendedor extends Exception {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snickers;
    private Deposito<Moneda> monVu;

    private int pB;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public static final int FANTA=3;
    public static final int SUPER8 = 4;
    public static final int SNICKERS = 5;

    public Expendedor(int numBebidas, int precioBebidas) throws NoHayProductoException{
        if(numBebidas<=0){
            throw new NoHayProductoException("No hay productos");
        }
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

    public Producto comprarBebida(Moneda m, int sabor) throws PagoInsuficienteExcepcion,NoHayProductoException,PagoIncorrectoException {
        if(sabor == 1 || sabor == 2 || sabor ==3 || sabor == 4 || sabor ==5){
            if(m==null){throw new PagoIncorrectoException("Moneda invalida");}

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
                if(sabor==SUPER8){
                    out = super8.get();
                }
                if(sabor==SNICKERS){
                    out = snickers.get();
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
                throw new PagoInsuficienteExcepcion("No se pudo completar la compra por pago insuficiente.");
            }

            if(out==null){
                monVu.add(m);

            }
            return out;
        }
        else{
            throw new NoHayProductoException("No se selecciono un producto valido");
        }
        }


    public Moneda getVuelto(){
        return monVu.get();
    }
}
