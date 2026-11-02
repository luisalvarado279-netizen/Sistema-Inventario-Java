/** Clase base que encapsula los datos y operaciones comunes de cualquier producto. */
public class Producto {
    private final String nombre;
    private final double precio;
    private int existencias;

    public Producto(String nombre, double precio, int existencias) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("Nombre obligatorio");
        if (!Double.isFinite(precio) || precio < 0 || existencias < 0) throw new IllegalArgumentException("Precio o existencias invalidos");
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getExistencias() { return existencias; }
    public void agregarExistencias(int unidades) {
        if (unidades <= 0) throw new IllegalArgumentException("Las unidades deben ser positivas");
        existencias += unidades;
    }
    public boolean vender(int unidades) {
        if (unidades <= 0) throw new IllegalArgumentException("Las unidades deben ser positivas");
        if (unidades > existencias) return false;
        existencias -= unidades;
        return true;
    }
    public double calcularValorInventario() { return precio * existencias; }
    /** Punto de extension: las subclases pueden sobrescribir esta descripcion. */
    public String mostrarDetalle() {
        return String.format("%s | $%.2f | unidades: %d | valor: $%.2f", nombre, precio, existencias, calcularValorInventario());
    }
}
