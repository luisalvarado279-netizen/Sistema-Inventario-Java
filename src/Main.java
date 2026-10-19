/** Punto de entrada: crea objetos y comprueba sus métodos. */
public class Main {
    public static void main(String[] args) {
        // Instanciación mediante constructores.
        Producto teclado = new Producto("Teclado", 350.00, 10);
        Producto mouse = new Producto("Mouse", 180.00, 15);
        Inventario inventario = new Inventario();

        // Registrar los objetos creados.
        inventario.agregarProducto(teclado);
        inventario.agregarProducto(mouse);

        // Prueba de métodos: ingresar y vender unidades.
        teclado.agregarExistencias(5);
        boolean ventaExitosa = mouse.vender(3);
        boolean ventaRechazada = mouse.vender(100);

        System.out.println("=== SISTEMA DE INVENTARIO ===");
        inventario.mostrarProductos();
        System.out.println("Venta de 3 mouse: " + ventaExitosa);
        System.out.println("Venta de 100 mouse: " + ventaRechazada);
        System.out.printf("Valor total: $%.2f%n", inventario.calcularValorTotal());
    }
}
