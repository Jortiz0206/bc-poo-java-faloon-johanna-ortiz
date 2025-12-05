# 📈 ANALISIS.MD - Proyecto Final: Integración de Patrones (S01-S09)

## 1. Patrón Singleton (Aplicado a BeautyCenter.java)

* **Problema Resuelto:** Evita que existan múltiples instancias de la clase gestora, lo cual es crítico, ya que solo debe haber una lista maestra de citas y una instancia de persistencia de datos.
* **Implementación:**
    1.  El constructor se definió como **`private`**.
    2.  El método estático **`getInstance()`** verifica si la instancia (`instance`) ya existe; si no, la crea (creación perezosa).
* **Beneficio POO:** Garantiza la **coherencia del estado global** del sistema de agendamiento y cumple con el **Principio de Responsabilidad Única (SRP)**, ya que `BeautyCenter` es el único responsable de la gestión de la colección.

## 2. Patrón Factory Method (Aplicado a ServiceFactory.java)

* **Problema Resuelto:** Centraliza y simplifica la creación de objetos complejos (`FacialTreatment`, `ManicurePedicure`) que pertenecen a la jerarquía de herencia.
* **Implementación:**
    * La clase **`ServiceFactory`** tiene un método estático (`createService`) que recibe un parámetro (`"FACIAL"`, `"MANICURE"`) y devuelve el objeto correcto.
    * El método Factory es responsable de calcular la lógica inicial (ej., el costo de lujo del 20%) y de manejar la excepción **`ServicioInvalidoException`** si los datos son incorrectos.
* **Beneficio POO:** Cumple con el **Principio Abierto/Cerrado (OCP)**. Si se añade un nuevo servicio (`BodyTreatment`), solo se modifica el `ServiceFactory` para incluir el nuevo `case`, dejando intacto el código que llama a la creación (el `Main.java` o el gestor).

## 3. Integración de Conceptos Finales (S01 - S08)

El proyecto final demuestra la integración exitosa de todas las fases del bootcamp:

* **Abstracción (S06):** El `Main` usa referencias abstractas (`ServiceElement`, `Billable`, `Schedulable`).
* **Herencia/Polimorfismo (S04/S05):** El Factory Method devuelve un objeto de tipo `Service` (polimorfismo), que luego invoca el método `calculateFinalPrice()` sobrescrito.
* **Excepciones (S07):** El `try-catch` y las excepciones personalizadas (`ServicioInvalidoException`) aseguran el manejo robusto de los errores de datos desde la capa de creación (`ServiceFactory`).
* **Colecciones (S08):** El Singleton gestiona un `ArrayList` de citas y llama a la persistencia de datos (I/O).