/** Representa un producto con nombre, precio y existencias. */
public class Producto {
    private String nombre;
    private double precio;
    private int existencias;

    /** Inicializa un producto con datos válidos. */
    public Producto(String nombre, double precio, int existencias) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre obligatorio");
        if (precio < 0 || existencias < 0) throw new IllegalArgumentException("Precio y existencias no pueden ser negativos");
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    /** Regresa el nombre del producto. */
    public String getNombre() { return nombre; }

    /** Regresa las existencias disponibles. */
    public int getExistencias() { return existencias; }

    /** Calcula el valor monetario del inventario del producto. */
    public double calcularValorInventario() { return precio * existencias; }

    /** Agrega unidades al inventario. */
    public void agregarExistencias(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        existencias += cantidad;
    }

    /** Retira unidades sin permitir inventario negativo. */
    public boolean vender(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        if (cantidad > existencias) return false;
        existencias -= cantidad;
        return true;
    }

    /** Retorna una descripción para mostrar en consola. */
    @Override
    public String toString() {
        return String.format("%s | $%.2f | unidades: %d | valor: $%.2f",
                nombre, precio, existencias, calcularValorInventario());
    }
}
