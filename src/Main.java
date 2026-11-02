import java.time.LocalDate;
/** Programa principal que instancia y prueba las clases derivadas. */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        ProductoElectronico teclado = new ProductoElectronico("Teclado", 350, 10, 12);
        ProductoElectronico mouse = new ProductoElectronico("Mouse", 180, 15, 6);
        ProductoPerecedero alimento = new ProductoPerecedero("Alimento", 50, 8, LocalDate.now().plusDays(30));
        ProductoPerecedero caducado = new ProductoPerecedero("Lote caducado", 20, 5, LocalDate.now().minusDays(1));
        teclado.agregarExistencias(5); // Metodo heredado de Producto.
        boolean ventaMouse = mouse.vender(3); // Metodo heredado.
        boolean ventaSinStock = mouse.vender(100);
        boolean ventaCaducado = caducado.vender(1); // Metodo sobrescrito.
        inventario.agregarProducto(teclado);
        inventario.agregarProducto(mouse);
        inventario.agregarProducto(alimento);
        inventario.agregarProducto(caducado);
        System.out.println("=== SISTEMA DE INVENTARIO: HERENCIA ===");
        inventario.mostrarProductos(); // Polimorfismo: cada subclase define detalle propio.
        System.out.println("Venta de 3 mouse: " + ventaMouse);
        System.out.println("Venta de 100 mouse: " + ventaSinStock);
        System.out.println("Venta de lote caducado: " + ventaCaducado);
        System.out.println("Teclado tiene garantia: " + teclado.tieneGarantia());
        System.out.printf("Valor total: $%.2f%n", inventario.calcularValorTotal());
    }
}
