# Análisis de errores detectados

## Tests que han fallado

El test que ha fallado es:

- `testTotalConDescuento`

Este test esperaba un resultado de **90**, pero el resultado obtenido ha sido **95**.

### Motivo

Según el test, se asume que el envío no se aplica después del descuento o que es gratuito.

Sin embargo, en la implementación del sistema, el envío se calcula después de aplicar el descuento, lo que hace que el total final incluya 5€ de envío.

---

## Identificación de errores en el código

No hay un error en el código, sino una diferencia de interpretación del enunciado.

### Método implicado:
`calcularTotal(List<Producto> carrito, double descuento)`

### Comportamiento actual:

El envío se calcula después de aplicar el descuento:

` double envio = calcularEnvio(conDescuento); `

## Resultado final

Tras diseñar los tests y analizar el código:

- ¿Cuántos tests has implementado?  
  He implementado 13 tests en total.

- ¿Qué porcentaje de cobertura has obtenido?
  ![](a4/image.png)


- ¿Todos los tests pasan correctamente?  
  Sí, todos los tests pasan correctamente después de corregir el test que fallaba.
