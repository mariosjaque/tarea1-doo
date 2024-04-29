package tarea1;
import java.util.ArrayList;

/**
 * Esta es una clase que crea un deposito generico para guardar bebidas y dulces
 * @param <T> se puede usar para diferentes tipos de objetos usando el tipo generico <T>
 */
public class Deposito<T> {
    private ArrayList<T> al;

    /**
     * El metodo constructor de deposito crea un arraylist para ordenar los objetos
     */
    public Deposito(){
        al = new ArrayList<T>();
    }

    /**
     * El metodo add permite agregar bebidas o dulces en el deposito
     * @param beb asigna el sabor de la bebida que debe guardarse en el deposito
     */
    public void add(T beb){
        al.add(beb);
    }

    /**
     * get es un metodo que cuando existe stock retira la primera bebida del deposito, si no, retorna null.
     * @return solo puede retornar dos cosas, null (el deposito esta vacio) o el producto que ocupe el nuemro 0
     * en el arraylist
     */
    public T get(){
        if(al.isEmpty()){
            return null;
        } else {
            return al.removeFirst();
        }
    }
}
