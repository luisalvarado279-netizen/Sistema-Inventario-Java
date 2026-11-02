# Sistema de Inventario Java — Actividad Formativa 3: Herencia

Continuación del proyecto de la Actividad Formativa 2 de Programación Orientada a Objetos, Universidad Ciudadana de Nuevo León.

## Requisitos
Java JDK 11 o superior, sin bibliotecas externas.

## Compilar y ejecutar
Desde la raíz del repositorio:

```bash
javac -d out src/*.java
java -cp out Main
java -cp out Pruebas
```

## Clases y herencia
- `Producto`: clase base; nombre, precio, existencias, ventas, valor y método `mostrarDetalle()`.
- `ProductoElectronico extends Producto`: agrega meses de garantía, `tieneGarantia()` y sobrescribe `mostrarDetalle()`.
- `ProductoPerecedero extends Producto`: agrega fecha de caducidad y sobrescribe `vender()` y `mostrarDetalle()`.
- `Inventario`: registra instancias de `Producto` y subclases; demuestra polimorfismo.
- `Main`: crea las clases derivadas y comprueba sus operaciones.
- `Pruebas`: ocho comprobaciones automáticas ejecutables sin dependencias.

## Relación con la Actividad 2
Conserva la clase base `Producto`, las operaciones de existencias, venta, cálculo de valor, la clase `Inventario` y el método `Main`. Agrega derivación, reutilización mediante `super`, sobrescritura con `@Override` y métodos propios.

## Evidencias pendientes de integrar en el informe
Capturas reales del IDE y ejecución, presentación en sesión en línea y enlace a la grabación. Esta rama contiene el código y las pruebas; la grabación no está incluida.
