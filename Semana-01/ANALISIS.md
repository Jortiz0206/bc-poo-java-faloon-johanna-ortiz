**Estudiante:** Faloon Johanna Ortiz Londoño
**Dominio Asignado:** Centro de Estética y Belleza "Belleza Total"

---

## 1. Identificación y Modelado de Clases (Ejercicio 4, 1/4)

### Clase Principal del Dominio: `Servicio.java`
* **Justificación:** Es el núcleo del negocio, representa el producto que genera ingresos.
* **Atributos:** `codigoServicio`, `nombre`, `precio`, `duracionMinutos`.
* **Métodos Clave:** `calcularPrecioConDescuento()`, `mostrarDetalles()`.

### Clase Secundaria Relacionada: `Cliente.java`
* **Justificación:** Representa al actor principal que consume el servicio y es crucial para la fidelización.
* **Atributos:** `idCliente`, `nombre`, `telefono`, `historialFidelidad`.
* **Métodos Clave:** `esClienteVIP()`, `mostrarContacto()`.

---

## 2. Comparación de Paradigmas POO vs. Estructurado (Ejercicio 4, 2/4)

La Programación Orientada a Objetos (POO) supera a la Programación Estructurada (PE) en este contexto gracias al **Encapsulamiento**.

| Paradigma | Manejo del Descuento | Ventaja POO |
| :--- | :--- | :--- |
| **PE (Estructurada)** | Los datos (`precio`) y la lógica (`función_descuento`) están separados, lo que facilita errores si se pasa el dato equivocado. | El método **`calcularPrecioConDescuento()`** está dentro de la clase **`Servicio`**, asegurando que la lógica siempre opere sobre su propio precio correcto. |
| **POO (Orientada a Objetos)** | El método `calcularPrecioConDescuento()` es parte del objeto `Servicio`, agrupando dato y lógica. | El objeto **`Cliente`** usa su método **`esClienteVIP()`** para determinar su estado, centralizando la responsabilidad. |

---

## 3. Demostración de Conceptos POO (Ejercicio 4, 3/4)

La implementación en **`PruebaBellezaTotal.java`** demuestra:

* **Clase y Objeto:** Se usa la plantilla (`Servicio`) para crear objetos concretos (`facial`).
* **Atributos:** Las características del objeto (`precio` del facial) están definidas.
* **Métodos:** Se utiliza el comportamiento del objeto (`facial.calcularPrecioConDescuento()`) para implementar una regla de negocio.

---

## 4. Estructura de Entrega de Archivos (Ejercicio 4, 4/4)

| Ejercicio | Archivo Entregado | Clase |
| :--- | :--- | :--- |
| Ejercicio 1 (Principal) | `Servicio.java` | Objeto Principal |
| Ejercicio 2 (Secundario) | `Cliente.java` | Objeto Secundario |
| Ejercicio 3 (Demostración) | `PruebaBellezaTotal.java` | Programa Principal |
| Ejercicio 4 (Análisis) | `ANALISIS.md` | Documento Conceptual |

---