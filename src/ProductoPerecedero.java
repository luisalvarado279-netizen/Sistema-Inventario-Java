import java.time.LocalDate;
/** Subclase con fecha de caducidad y una validacion exclusiva para ventas. */
public class ProductoPerecedero extends Producto {
    private final LocalDate fechaCaducidad;
    public ProductoPerecedero(String nombre, double precio, int existencias, LocalDate fechaCaducidad) {
        super(nombre, precio, existencias);
        if (fechaCaducidad == null) throw new IllegalArgumentException("Fecha obligatoria");
        this.fechaCaducidad = fechaCaducidad;
    }
    public boolean estaCaducado(LocalDate fecha) { // Metodo exclusivo de la subclase.
        return fecha.isAfter(fechaCaducidad);
    }
    @Override
    public boolean vender(int unidades) { // Sobrescritura que aplica una regla propia.
        if (estaCaducado(LocalDate.now())) return false;
        return super.vender(unidades); // Reutiliza la validacion y resta del producto base.
    }
    @Override
    public String mostrarDetalle() {
        return super.mostrarDetalle() + " | caducidad: " + fechaCaducidad;
    }
}
