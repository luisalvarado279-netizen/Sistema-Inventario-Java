import java.util.ArrayList;
import java.util.List;
/** Gestiona productos base y derivados mediante polimorfismo. */
public class Inventario {
    private final List<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto producto) {
        if (producto == null) throw new IllegalArgumentException("Producto obligatorio");
        productos.add(producto);
    }
    public void mostrarProductos() {
        for (Producto producto : productos) System.out.println(producto.mostrarDetalle());
    }
    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : productos) total += producto.calcularValorInventario();
        return total;
    }
}
