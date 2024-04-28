package tarea1;
import java.util.ArrayList;
public class Deposito<T> {
    private ArrayList<T> al;

    public Deposito(){
        al = new ArrayList<T>();
    }

    public void add(T beb){
        al.add(beb);
    }

    public T get(){
        if(al.isEmpty()){
            return null;
        } else {
            return al.removeFirst();
        }
    }
}
