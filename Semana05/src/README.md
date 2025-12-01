# 🔱 README.md - Semana 05: Polimorfismo Avanzado

## 🎯 Objetivo
Aplicar los conceptos de **Sobrecarga (Overloading)** y **Sobrescritura (Overriding)** para optimizar la jerarquía de servicios, demostrando el polimorfismo en la gestión de costos.

## 🏗️ Implementaciones Clave

### 1. Sobrecarga de Métodos (Overloading)
* **Clase Afectada:** `BeautyCenter.java`
* **Funcionalidad:** El método **`findService()`** fue sobrecargado para permitir la búsqueda de servicios por código (`String`) y por rango de precios (`double, double`), mejorando la flexibilidad de la clase gestora.

### 2. Sobrescritura de Métodos (Overriding)
* **Método Clave:** `calculateFinalPrice()`
* **Clases Afectadas:** `FacialTreatment.java` y `ManicurePedicure.java`
* **Funcionalidad:** Se utilizó **`@Override`** para reemplazar la lógica de cálculo de precio de la clase padre (`Service`), permitiendo a cada clase hija aplicar sus propios impuestos, recargos, y costos extra.

### 3. Polimorfismo Dinámico
* **Clase Afectada:** `SystemProcessor.java`
* **Demostración:** El método `facturarServicio()` acepta un objeto del tipo Padre (`Service`) pero, gracias al polimorfismo, ejecuta el cálculo de precio **sobrescrito** de la clase hija (`FacialTreatment` o `ManicurePedicure`) en tiempo de ejecución.

## ✅ Estado del Proyecto
La estructura de clases de servicio (`Service`, `FacialTreatment`, `ManicurePedicure`) es ahora completamente funcional para el cálculo dinámico de costos.