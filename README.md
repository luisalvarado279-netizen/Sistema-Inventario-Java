# Sistema de Inventario en Java

Actividad formativa 2: desarrollo de una aplicación simple con clases, atributos, objetos, constructores y métodos.

## Requisitos
Java JDK 11 o superior. No requiere librerías externas.

## Cómo ejecutar
Desde la carpeta raíz:

```bash
javac -d out src/*.java
java -cp out Main
```

En Windows con PowerShell puedes usar `javac -d out src/*.java` y `java -cp out Main`.

## Arquitectura
- `Producto`: encapsula nombre, precio y existencias; permite agregar unidades, vender y calcular el valor individual.
- `Inventario`: almacena productos, los muestra y calcula el valor total.
- `Main`: instancia objetos y prueba las operaciones.

## Resultado esperado
```text
=== SISTEMA DE INVENTARIO ===
Teclado | $350.00 | unidades: 15 | valor: $5250.00
Mouse | $180.00 | unidades: 12 | valor: $2160.00
Venta de 3 mouse: true
Venta de 100 mouse: false
Valor total: $7410.00
```

## Conceptos aplicados
- Declaración de clases y atributos privados
- Instanciación de objetos mediante constructores
- Métodos de consulta, modificación y validación
- Comentarios de documentación en el código
- Pruebas de ventas válidas y rechazadas
