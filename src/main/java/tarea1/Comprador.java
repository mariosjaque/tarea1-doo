package tarea1;

/**
 *  La clase comprador emula y ejecuta el proceso completo de un comprador
 *  haciendole saber al programa cuanto dinero tiene, que producto quiere y de que expendedor quiere sacarlo
 */
public class Comprador extends Exception{
    private String sonido;
    private int vuelto;

    /**
     *
     * @param m se refire a moneda, le indica al programa cuanto dinero tiene el comprador
     * @param cualProducto permite seleccionar de un enum que producto retirar
     * @param exp le asigna el nombre exp a Expendedor
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException,PagoIncorrectoException,PagoInsuficienteExcepcion{
        Producto queCompre = exp.comprarProducto(m, cualProducto);
        /**
         * Cada vez que la transaccion es aprobada, el producto comprado emite un sonido
         */
        if(queCompre!=null){sonido = queCompre.Sonido();}
        else{sonido=null;}
        while(true){
            Moneda mod = exp.getVuelto();
            if(mod==null){
                break;
            }
            vuelto+=mod.getValor();
        }

    }

    /**
     *
     * @return retorna la cantidad de vuelto que fue otorgada
     */
    public int cuantoVuelto(){
        return vuelto;

    }

    /**
     *
     * @return
     */
    public String queCompraste(){
        return sonido;
    }


}
