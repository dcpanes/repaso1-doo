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

    public Boolean productoDisponible(String id){
        if(id.equals("")){
            return false;
        }
        Boolean existe = false;
        for (Producto p :  obtenerProductos()){
            if(p.obtieneId().equals(id)){
                existe = true;
                break;
            }
        }
        return existe;
    }


}