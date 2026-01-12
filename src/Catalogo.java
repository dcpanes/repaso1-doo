import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public List<Producto> obtenerProductos(){
        return productos;
    }

}