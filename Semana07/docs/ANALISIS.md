# ANALISIS.MD - Semana 07: Paquetes y Manejo de Excepciones

## 1. Implementación de la Estructura Profesional (Paquetes)

El código ha sido movido a la estructura de paquetes `com.belleza.modulo` para mejorar la modularidad y el control de acceso:
* **`modelo/`**: Contiene clases de entidad (`Service`, `Client`).
* **`servicio/`**: Contiene clases de lógica de negocio (`BeautyCenter`).
* **`excepciones/`**: Contiene las clases de error específicas del dominio.

## 2. Validación y Lanzamiento de Excepciones (Ejercicio 2)

Se integró la validación directamente en el constructor de la clase `Service.java`:
* **Mecanismo:** El constructor utiliza la cláusula **`throws ServicioInvalidoException`** para forzar a que cualquier código que cree un `Service` maneje el posible fallo de datos.
* **Beneficio:** Esto previene la creación de objetos con estado inconsistente (ej., precio 0.0), lo cual es crucial para la integridad de los datos en el centro de estética.

## 3. Uso de Excepciones Personalizadas (Ejercicio 3)

Se crearon excepciones que extienden `Exception` (Checked Exceptions) para errores de negocio irrecuperables por el programa:
* **`ServicioInvalidoException`:** Gestiona fallos por datos incorrectos ingresados por el usuario.
* **`CitaNoDisponibleException`:** Gestiona fallos por lógica de negocio (ej., el cupo de la esteticista está lleno).

## 4. Demostración y Recuperación (Ejercicio 4)

El `Main.java` demuestra el control de flujo de errores:
* **Casos de Fallo:** Se simula la falla al intentar crear un servicio con precio 0.0 y se lanza la `CitaNoDisponibleException`.
* **Recuperación:** El bloque `try-catch` permite que el programa capture el fallo (ej., la creación de un servicio) y continúe ejecutando el código siguiente (ej., creando un nuevo cliente válido), demostrando la robustez del sistema.
* **Cierre de Recursos:** El uso de `finally` (o `try-with-resources` para archivos) garantiza que los recursos se cierren siempre, sin importar si ocurre un error.