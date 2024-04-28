package tarea1;
public class Comprador extends Exception{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoInsuficienteExcepcion,NoHayProductoException {
        Producto queCompre = null;
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

    public int cuantoVuelto(){
        return vuelto;

    }
    public String queCompraste(){
        return sonido;
    }


}
