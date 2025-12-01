# 📝 Actividad 1: Identificación de 5 Objetos (Ejercicio 01)

**Dominio Asignado:** Centro de Estética y Belleza "Belleza Total"

---

## Objetos Identificados en el Dominio

| Objeto | Definición (¿Qué es?) | Atributos (Características) | Comportamientos (Métodos) |
| :--- | :--- | :--- | :--- |
| **1. Servicio de Estética** | El tratamiento ofrecido (ej: Facial, Manicure, Depilación). | `serviceCode`, `nombre`, `precio`, `duracionMinutos`, `tipo` | `calcularCosto()`, `agendarServicio()`, `mostrarDetalles()` |
| **2. Cliente** | La persona que recibe y paga por el servicio. | `clientId`, `nombre`, `telefono`, `email`, `historialCitas` | `pagar()`, `solicitarCita()`, `actualizarDatos()` |
| **3. Esteticista** | El empleado especializado que aplica los tratamientos. | `employeeId`, `nombre`, `especialidad`, `tasaComision` | `realizarServicio()`, `calcularComision()`, `gestionarAgenda()` |
| **4. Cita (Appointment)** | Una reserva de tiempo específica que relaciona a un cliente con un servicio y una esteticista. | `appointmentId`, `fecha`, `hora`, `estado` (`Pendiente`/`Finalizada`) | `confirmar()`, `cancelar()`, `notificarRecordatorio()` |
| **5. Producto** | Insumo usado en los tratamientos o vendido al público (ej: cremas, esmaltes). | `productId`, `nombre`, `stockActual`, `precioVenta`, `proveedor` | `vender()`, `reponerStock()`, `aplicarDescuento()` |