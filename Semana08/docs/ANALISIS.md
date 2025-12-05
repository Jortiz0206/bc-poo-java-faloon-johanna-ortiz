# 📝 COLECCIONES.md - Semana 08: Análisis de Colecciones

## 1. Migración a ArrayList y Genéricos (Ejercicio 1)
* **ArrayList:** La colección principal para almacenar los objetos de relación (`Appointment`) fue migrada a **`List<Appointment> historialCitas = new ArrayList<>();`**.
* **Genéricos:** Se aplicó el uso de Genéricos (`<Appointment>`, `<String>`) en todas las declaraciones de colecciones, eliminando el riesgo de "raw types" y asegurando la seguridad de tipos en tiempo de compilación.

## 2. Implementación de HashMap (Búsqueda O(1)) (Ejercicio 2)
* **Estructura:** Se utilizó un **`Map<String, Appointment> citasPorCodigo`** para asociar el código único de la cita (la clave) con el objeto de la cita.
* **Beneficio O(1):** El método `buscarCitaPorCodigo()` utiliza `map.get(key)`, lo que permite buscar una cita en tiempo **constante (O(1))**, independientemente del tamaño de la colección, un avance significativo sobre la búsqueda secuencial (O(n)).
* **Sincronización:** Se aseguró que los métodos `addAppointment()` mantengan la sincronización entre el `ArrayList` (`historialCitas`) y el `HashMap` (`citasPorCodigo`).

## 3. Operaciones de Filtrado y Estadísticas (Ejercicio 3)

Se implementaron métodos para extraer valor de las colecciones:
* **Filtrado:** `filtrarPorNombreServicio()` itera sobre el `historialCitas` para devolver solo aquellas citas que cumplen un criterio específico.
* **Estadísticas:** `calcularTotalVentas()` itera para sumar el valor final de cada servicio dentro de la colección.

Esta implementación de colecciones es fundamental para que el sistema de gestión del centro de estética sea eficiente y escalable.