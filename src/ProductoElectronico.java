/** Subclase que hereda las operaciones de Producto y agrega una garantia. */
public class ProductoElectronico extends Producto {
    private final int garantiaMeses;
    public ProductoElectronico(String nombre, double precio, int existencias, int garantiaMeses) {
        super(nombre, precio, existencias); // Reutiliza constructor y validaciones de Producto.
        if (garantiaMeses < 0) throw new IllegalArgumentException("Garantia invalida");
        this.garantiaMeses = garantiaMeses;
    }
    public int getGarantiaMeses() { return garantiaMeses; }
    public boolean tieneGarantia() { return garantiaMeses > 0; } // Metodo propio.
    @Override
    public String mostrarDetalle() { // Sobrescritura con reutilizacion del metodo base.
        return super.mostrarDetalle() + " | garantia: " + garantiaMeses + " meses";
    }
}
