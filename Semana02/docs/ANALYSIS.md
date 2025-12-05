# 📝 ANALISIS.md - Semana 02: Implementación de Relaciones

## 1. Identificación de Nuevas Clases (Ejercicio 1)
Se crearon dos nuevas clases para complementar el modelo de negocio:
* **Product.java:** Necesario para el control de inventario de insumos (cremas, esmaltes). Incluye la lógica `needsReorder()`.
* **CustomerRecord.java:** Necesario para el seguimiento a largo plazo del cliente. Incluye la lógica `isLoyaltyEligible()` basada en el gasto total.

## 2. Implementación de Relaciones (Ejercicio 2)
### Objeto Conector: Appointment.java
La clase `Appointment` demuestra la **Asociación/Agregación** al tener atributos de tipo objeto (`Client client;`, `Esthetician esthetician;`, `Service service;`).

* **Justificación:** El constructor de `Appointment` requiere las instancias de `Client`, `Esthetician` y `Service`, lo cual es el modelo exacto de cómo funciona una agenda en la vida real.
* **Método de Negocio:** `calculateAppointmentDuration()` usa un *getter* de la clase `Service` (Semana 01) para calcular la duración total, demostrando la **interacción** entre objetos.

## 3. Uso de Colecciones (Ejercicio 3)
### Objeto Gestor: BeautyCenter.java
* **Estructura de Datos:** Se utilizó un `ArrayList<Appointment>` dentro de la clase `BeautyCenter`.
* **Ventaja:** El `ArrayList` permite manejar un número dinámico de citas, cumpliendo con el requisito de ser la estructura de datos que gestiona la colección de objetos de relación (`Appointment`).
* **Funcionalidad:** Los métodos `addAppointment()` y `listAppointmentsSummary()` demuestran la funcionalidad CRUD básica sobre la colección.