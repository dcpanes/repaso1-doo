import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);
    Catalogo catalogo = new Catalogo();
    CarroCompras carro = new CarroCompras();

    Producto producto1 = new Producto("1", "iphone", 100.0);
    Producto producto2 = new Producto("2", "samsung", 200.0);
    Producto producto3 = new Producto("3", "xiaomi", 300.0);

    catalogo.agregarProducto(producto1);
    catalogo.agregarProducto(producto2);
    catalogo.agregarProducto(producto3);

    for (Producto p : catalogo.obtenerProductos()){
        System.out.println(
                " Id :" + p.obtieneId() +
                " Nombre :" + p.obtieneNombre() +
                " Precio :" + p.obtienePrecio()
        );
    }

    System.out.println("Selecciona un id de producto para añadir al carro...");


    if(!catalogo.productoDisponible( scanner.nextLine() )){
        System.out.println("Producto seleccionado no disponible");
        return;
    }

    System.out.println("Productos del carro");
    for (Producto p : carro.obtenerProductosDelCarro()){
        System.out.println(
                " Id :" + p.obtieneId() +
                " Nombre :" + p.obtieneNombre() +
                " Precio :" + p.obtienePrecio()
        );
    }

    carro.obtieneTotalCarro();

}
