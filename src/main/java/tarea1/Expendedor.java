package tarea1;
public class Expendedor extends Exception {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snickers;
    private Deposito<Moneda> monVu;

    public Expendedor(int numProductos) throws NoHayProductoException {
        if(numProductos<=0){
            throw new NoHayProductoException("No hay productos");
        }
        coca = new Deposito<Producto>();
        for(int i=100;i<numProductos+100;i++){
            Producto beo = new CocaCola(i);
            coca.add(beo);
        }
        sprite = new Deposito<Producto>();
        for(int i=200;i<numProductos+200;i++){
            Producto beo = new Sprite(i);
            sprite.add(beo);
        }

        fanta = new Deposito<Producto>();
        for(int i=300;i<numProductos+300;i++){
            Producto beo = new Fanta(i);
            fanta.add(beo);
        }

        super8 = new Deposito<Producto>();
        for(int i=400;i<numProductos+400;i++){
            Producto beo = new Super8(i);
            super8.add(beo);
        }

        snickers = new Deposito<Producto>();
        for(int i=500;i<numProductos+500;i++){
            Producto beo = new Snickers(i);
            snickers.add(beo);
        }

        monVu = new Deposito<Moneda>();
    }

    public Producto comprarProducto(Moneda m, int prodnum) throws PagoInsuficienteExcepcion,NoHayProductoException,PagoIncorrectoException {
        if(m==null){throw new PagoIncorrectoException("Moneda invalida");}
        int pB=0;
        productos producto = null;

        if(prodnum >= 1 && prodnum <= 5){
            producto = productos.values()[prodnum - 1];
            pB = producto.valorProductos();
        } else {
            throw new NoHayProductoException("No se seleccionó un producto valido");
        }

        Producto out = null;
        if(m.getValor()<pB){
            throw new PagoInsuficienteExcepcion("No se pudo completar la compra por pago insuficiente.");
        } else {
            switch (producto) {
                case COCA:
                    out = coca.get();
                    break;
                case SPRITE:
                    out = sprite.get();
                    break;
                case FANTA:
                    out = fanta.get();
                    break;
                case SNICKERS:
                    out = snickers.get();
                    break;
                case SUPER8:
                    out = super8.get();
                    break;
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

        if(out==null){
            monVu.add(m);

        }
        return out;

    }


    public Moneda getVuelto(){
        return monVu.get();
    }
}
