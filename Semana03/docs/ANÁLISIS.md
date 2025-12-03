# ANALISIS.MD - Semana 03: Encapsulación, Sobrecarga y Robustez

## 1. Aplicación de Encapsulación Completa (Ejercicio 1)

El principio fundamental de Encapsulación fue aplicado a las clases principales (`Client.java` y `Esthetician.java`) para proteger el estado del objeto.

* **Implementación:** Todos los atributos fueron declarados como **`private`** (`String name;`, `double commissionRate;`).
* **Control de Acceso:** La modificación y lectura de los datos se realiza estrictamente a través de métodos **`public`** (Getters y Setters), asegurando que los datos internos no puedan ser alterados directamente desde el exterior.

## 2. Implementación de Sobrecarga de Constructores (Ejercicio 2)

Se implementó la sobrecarga para ofrecer al sistema una mayor flexibilidad en la inicialización de objetos.

* **En `Esthetician.java`:** Se creó un **Constructor Parcial** que acepta solo el ID y Nombre, llamando al constructor completo para asignar valores por defecto (`General`, `0.05`).
* **En `Client.java`:** Se creó un **Constructor Mínimo** que permite crear un cliente solo con su ID y Nombre, asignando "N/A" a los campos opcionales.

## 3. Integración de Validaciones y Excepciones (Ejercicio 3)

La lógica de validación fue movida de la lógica principal del programa (Main) y centralizada en el objeto mediante el uso de Setters y Constructores.

| Clase | Atributo | Regla de Validación | Beneficio Logrado |
| :--- | :--- | :--- | :--- |
| **`Esthetician`** | `commissionRate` | Valida que la tasa de comisión esté en el rango de **0.0 a 0.5** (0%-50%). | **Integridad de Datos:** Previene la asignación de valores ilógicos o fuera de los límites de negocio. |
| **`Client`** | `email` | Valida que el formato contenga el símbolo **`@`**. | **Seguridad:** Rechaza datos corruptos o inservibles antes de guardarlos. |

## 4. Beneficios Logrados (Justificación de Diseño)

| Aspecto de Diseño | Mejora Implementada | Ventaja para el Sistema |
| :--- | :--- | :--- |
| **Seguridad** | Setters con Validación y atributos `private`. | Los datos incorrectos (ej., comisión de 80%) son rechazados *inmediatamente* por la clase, no por la lógica del `Main`. |
| **Mantenibilidad** | Sobrecarga de Constructores. | Si se necesita cambiar el valor por defecto de la comisión, solo se cambia en un lugar (el constructor de `Esthetician`), simplificando el mantenimiento. |
| **Coherencia** | Uso de `this()` para que los constructores parciales llamen al constructor completo. | Garantiza que, sin importar qué constructor se use, las validaciones (como la de la comisión) se ejecuten siempre. |