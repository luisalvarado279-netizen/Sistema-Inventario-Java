import java.util.ArrayList;
import java.util.List;

/** Administra una colección de productos. */
public class Inventario {
    private final List<Producto> productos;

    /** Crea una colección de inventario inicialmente vacía. */
    public Inventario() {
        productos = new ArrayList<>();
    }

    /** Registra un producto en el inventario. */
    public void agregarProducto(Producto producto) {
        if (producto == null) throw new IllegalArgumentException("Producto obligatorio");
        productos.add(producto);
    }

    /** Muestra la información de todos los productos. */
    public void mostrarProductos() {
        for (Producto producto : productos) System.out.println(producto);
    }

    /** Suma el valor económico de todos los productos. */
    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : productos) total += producto.calcularValorInventario();
        return total;
    }
}
