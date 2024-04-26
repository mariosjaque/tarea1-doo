package tarea1;

import java.util.ArrayList;

public class DepositoM {
    private ArrayList<Moneda> al;

    public DepositoM(){

        al = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda mon){

        al.add(mon);
    }

    public Moneda getMoneda(){
        if(al.size()==0){
            return null;
        } else {
            return al.remove(0);
        }
    }
}
