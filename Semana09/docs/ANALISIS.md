# ANALISIS- Semana 09: Justificación de Patrones de Diseño

## 1. Patrón Singleton (Aplicado a BeautyCenter.java)

* **Justificación de Uso:** La clase `BeautyCenter` es el gestor central de todas las colecciones y la persistencia de datos. Es un error de diseño que existan dos o más listas de citas activas al mismo tiempo. El patrón Singleton previene esta inconsistencia.
* **Implementación:**
    * El constructor es **`private`** para prohibir la instanciación directa (`new`).
    * El acceso se realiza a través de un único punto: **`BeautyCenter.getInstance("Sede Principal")`**.
* **Beneficio (SOLID):** Mejora el **Principio de Responsabilidad Única (SRP)**, ya que la clase es la única responsable de mantener el estado global del sistema de agenda.

## 2. Patrón Factory Method (Aplicado a ServiceFactory.java)

* **Justificación de Uso:** La lógica de creación de un `FacialTreatment` es compleja (involucra calcular un costo extra o una duración específica). Este patrón es ideal para ocultar esa complejidad.
* **Implementación:** La clase `ServiceFactory` tiene un método estático **`createService(String type, ...)`** que decide si crear un `FacialTreatment` o un `ManicurePedicure` basado en el parámetro `type`.
* **Beneficio (SOLID):** Cumple con el **Principio Abierto/Cerrado (OCP)**. Si se añade un nuevo servicio (`DepilacionLaser`), solo se modifica el `ServiceFactory.java`, y el `Main.java` (el código cliente) permanece sin cambios.

---

*