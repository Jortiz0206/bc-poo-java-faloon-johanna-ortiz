# Conceptos Fundamentales POO - Semana 01

## 1. Actividad 1: Identificación de 5 Objetos (Ejercicio 01)

**Dominio:** Centro de Estética y Belleza "Belleza Total"

| Objeto | Definición (¿Qué es?) | Atributos (Características) | Comportamientos (Métodos) |
| :--- | :--- | :--- | :--- |
| **1. Servicio de Estética** | Tratamiento ofrecido al cliente. | `serviceCode`, `nombre`, `precio`, `duracionMinutos` | `calcularCosto()`, `agendarServicio()`, `mostrarDetalles()` |
| **2. Cliente** | Persona que recibe y paga por el servicio. | `clientId`, `nombre`, `telefono`, `historialCitas` | `pagar()`, `solicitarCita()`, `actualizarDatos()` |
| **3. Esteticista** | Empleado que aplica los tratamientos. | `employeeId`, `nombre`, `especialidad`, `tasaComision` | `realizarServicio()`, `calcularComision()`, `gestionarAgenda()` |
| **4. Cita** | Reserva específica de tiempo. | `appointmentId`, `fecha`, `hora`, `estado` | `confirmar()`, `cancelar()`, `notificarRecordatorio()` |
| **5. Producto** | Insumo usado o vendido (cremas, esmaltes). | `productId`, `nombre`, `stockActual`, `precioVenta` | `vender()`, `reponerStock()`, `aplicarDescuento()` |

---

## 2. Actividad 2: Comparación de Paradigmas (Ejercicio 02)

| Paradigma | Enfoque | Ejemplo Conceptual (Manejo de Precio) | Ventaja POO |
| :--- | :--- | :--- | :--- |
| **Programación Estructurada** (PE) | Se centra en la **lógica y funciones** que operan sobre **datos separados**. | El dato (`precio_servicio`) está fuera de la función (`aplicar_iva`), lo que puede causar desorden y errores. | El código es **más simple** en programas muy pequeños. |
| **Programación Orientada a Objetos** (POO) | Se centra en **Objetos** que agrupan y controlan sus propios **datos (atributos)** y **lógica (métodos)**. | El método `calcularPrecioFinalConIVA()` está dentro del objeto `BeautyService`, operando de forma segura sobre su propio atributo `price`. | Permite la **Encapsulación**, haciendo el código más modular, seguro y fácil de mantener. |