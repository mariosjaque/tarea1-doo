package tarea1;
class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida queCompre = exp.comprarBebida(m, cualBebida);
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
