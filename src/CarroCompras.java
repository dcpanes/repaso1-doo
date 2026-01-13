import java.util.ArrayList;
import java.util.List;

public class CarroCompras {
    private List<Producto> carro = new ArrayList<Producto>();

    public void agregarProductosAlCarro(Producto producto){
        carro.add(producto);
    }

    public List<Producto> obtenerProductosDelCarro(){
        return carro;
    }

    public Double obtieneTotalCarro() {
        return carro.stream()
                .map(Producto::obtienePrecio)
                .reduce(0.0,
                        (subtotal, precio) -> subtotal + precio);
    }
}
