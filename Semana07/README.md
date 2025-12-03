# README.md - Semana 07: Manejo Profesional de Excepciones y Paquetes

## Objetivo
Implementar la estructura de paquetes profesionales (`com.belleza.modelo`, etc.) y hacer el sistema robusto mediante el uso de excepciones personalizadas y bloques `try-catch-finally`.

## Implementaciones Clave

### 1. Estructura de Paquetes
* El proyecto ha sido reorganizado siguiendo el estándar Java (`com.dominio.modulo`).
* Los archivos están distribuidos en las capas: `modelo/`, `servicio/`, y `excepciones/`.

### 2. Excepciones Personalizadas
* **`ServicioInvalidoException`:** Lanzada para errores de validación de datos (Ej., precio <= 0).
* **`CitaNoDisponibleException`:** Lanzada para errores de lógica de negocio (Ej., agenda llena).

### 3. Manejo de Errores
* El constructor de `Service` utiliza la cláusula **`throws`** para delegar el manejo del error.
* El archivo `Main.java` demuestra el uso de bloques **`try-catch`** para la recuperación del sistema y la demostración de **`finally`** para el cierre de recursos.