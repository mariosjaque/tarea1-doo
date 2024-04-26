package tarea1;
public class VerificarProductos {

    public VerificarProductos() {
    }

    public void Error(Producto x) throws NoHayProductoException {
        if (x == null) {
            throw new NoHayProductoException("Se ha seleccionado un producto que no existe");
        }
    }
}
