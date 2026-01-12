//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Producto producto1 = new Producto("1", "iphone", 100.0);

    System.out.println("Id: " + producto1.obtieneId());
    System.out.println("Nombre: " + producto1.obtieneNombre());
    System.out.println("Precio: " + producto1.obtienePrecio());

}
