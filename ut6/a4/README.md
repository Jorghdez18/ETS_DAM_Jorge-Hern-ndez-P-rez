# 🧾 Análisis de errores detectados

---

## 1. Tests que han fallado

El test que ha fallado durante la ejecución inicial es:

- `testTotalConDescuento`

### 📌 Explicación

Según el enunciado del ejercicio, el cálculo del total debe seguir este orden:

> SUBTOTAL → APLICAR DESCUENTO → AÑADIR ENVÍO

En el caso del test:

- Producto: teclado (100 × 1)
- Subtotal: 100
- Descuento: 10%

El resultado esperado es:

- Subtotal = 100
- Con descuento = 90
- Envío = 0 (porque el subtotal final es ≥ 100)

👉 Por lo tanto, el total correcto debería ser **90**, pero el test falla porque el método no está aplicando correctamente la lógica del envío o del cálculo final.

---

## 2. Identificación de errores en el código

### 📍 Método afectado:
`calcularTotal(List<Producto> carrito, double descuento)`

### 📍 Posible línea incorrecta:

```java
double envio = calcularEnvio(subtotal);
