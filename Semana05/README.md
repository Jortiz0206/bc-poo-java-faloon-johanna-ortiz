# README.md - Semana 05: Polimorfismo Avanzado (Overloading/Overriding)

## Objetivo
Aplicar los conceptos de **Sobrecarga (Overloading)** y **Sobrescritura (Overriding)** para optimizar la jerarquía de servicios, demostrando el polimorfismo en la gestión de costos.

## Implementaciones Clave

### 1. Sobrecarga de Métodos (Overloading)
* **Clase Afectada:** `BeautyCenter.java`
* **Funcionalidad:** El método **`findService()`** fue sobrecargado para permitir la búsqueda de servicios por código y por rango de precios, mejorando la flexibilidad del sistema de consultas.

### 2. Sobrescritura de Métodos (Overriding)
* **Método Clave:** `calculateFinalPrice()`
* **Clases Afectadas:** `FacialTreatment.java` y `ManicurePedicure.java`
* **Funcionalidad:** Se utilizó **`@Override`** para reemplazar la lógica de cálculo de precio de la clase padre, permitiendo a cada clase hija aplicar sus propios impuestos o recargos.

### 3. Polimorfismo Dinámico
* **Demostración:** La clase `SystemProcessor.java` demuestra que puede procesar diferentes tipos de servicios (`FacialTreatment` vs `ManicurePedicure`) usando una única referencia de tipo `Service` (el Padre).