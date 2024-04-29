package tarea1;

/**
 * Crea un expendedor y define el comportamiento logico de este, incluyendo las excepciones
 */
public class Expendedor extends Exception {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snickers;
    private Deposito<Moneda> monVu;

    /**
     * Verifica el stock de cada producto
     * @param numProductos cantidad total de productos
     * @throws NoHayProductoException alerta al usuario de que el producto que desea comprar ya no tiene stock
     */
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

    /**
     * Realiza la operacion logica de comprar un producto
     * @param m representa la cantidad de dinero
     * @param prodnum la cantidad de productos a comprar
     * @throws NoHayProductoException es una excepcion que permite a la maquina detectar cuando el stock de producto = 0
     * @throws PagoInsuficienteExcepcion una excepcion que permite saber cuando el dinero ingresado es menos al precio del producto
     * @throws PagoIncorrectoException cuando no se pudo concretar la transaccion.
     */
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
            /**
             * Se utililza un switch case para que el programa identifique el producto y sepa
             * que tipo y sabor debe retitrar del deposito.
             */
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
        if (out==null){
            monVu.add(m);
            throw new NoHayProductoException("No hay stock de producto");
        }

        if(out==null){
            monVu.add(m);

        }
        return out;


    }

    /**
     * este metodo entrega el vuelto
     * @return devuelve el vuelto en monedas
     */
    public Moneda getVuelto(){
        return monVu.get();
    }
}
