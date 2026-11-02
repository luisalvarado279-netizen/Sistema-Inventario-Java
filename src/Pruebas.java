import java.time.LocalDate;
/** Pruebas automaticas ejecutables sin librerias externas: java Pruebas. */
public class Pruebas {
    private static void verificar(boolean condicion, String mensaje) {
        if (!condicion) throw new AssertionError(mensaje);
    }
    public static void main(String[] args) {
        ProductoElectronico teclado = new ProductoElectronico("Teclado", 350, 10, 12);
        teclado.agregarExistencias(5);
        verificar(teclado.getExistencias() == 15, "Agregar existencias heredado");
        verificar(teclado.calcularValorInventario() == 5250, "Valor heredado");
        verificar(teclado.mostrarDetalle().contains("garantia: 12 meses"), "Sobrescritura electronico");
        ProductoElectronico mouse = new ProductoElectronico("Mouse", 180, 15, 6);
        verificar(mouse.vender(3), "Venta valida");
        verificar(!mouse.vender(100) && mouse.getExistencias() == 12, "Sin stock");
        ProductoPerecedero pasado = new ProductoPerecedero("Pasado", 20, 5, LocalDate.now().minusDays(1));
        verificar(pasado.estaCaducado(LocalDate.now()), "Metodo propio caducidad");
        verificar(!pasado.vender(1) && pasado.getExistencias() == 5, "No vender caducado");
        ProductoPerecedero vigente = new ProductoPerecedero("Vigente", 50, 8, LocalDate.now().plusDays(10));
        verificar(vigente.vender(2) && vigente.getExistencias() == 6, "Venta vigente");
        Inventario inventario = new Inventario();
        inventario.agregarProducto(teclado); inventario.agregarProducto(mouse); inventario.agregarProducto(pasado);
        verificar(inventario.calcularValorTotal() == 7510, "Total polimorfico");
        System.out.println("8 comprobaciones superadas. PRUEBAS CORRECTAS.");
    }
}
