package tarea1;
class Comprador extends Exception{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws PagoInsuficienteExcepcion {
        Bebida queCompre= null;
        try {
            queCompre = exp.comprarBebida(m, cualBebida);
        } catch (PagoInsuficienteExcepcion e) {
            throw new RuntimeException(e);
        }
        if(queCompre!=null){sonido = queCompre.beber();}
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
    public String queBebiste(){
        return sonido;
    }


}
