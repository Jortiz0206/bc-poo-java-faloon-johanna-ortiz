# 🔱 Semana 04: Herencia y Polimorfismo

## 🎯 Objetivo
Implementación de la **Herencia** para establecer jerarquías en el dominio "Belleza Total" y demostración del **Polimorfismo** mediante la sobrescritura de métodos.

## 🏗️ Jerarquía Implementada
Se identificó la jerarquía "**es-un**" donde los tratamientos son tipos de `Service`.

* **Clase Padre (Superclase):** `Service.java`
    * Contiene atributos **`protected`** (`serviceCode`, `name`, `basePrice`) y métodos base (`calculateCost()`, `displayInfo()`).
* **Clases Hijas (Subclases):**
    * `FacialTreatment.java`
    * `ManicurePedicure.java`

## ✅ Conceptos Demostrados

| Concepto | Implementación |
| :--- | :--- |
| **Herencia** | Uso de `extends Service` en las subclases. |
| **Constructor Padre** | Uso de **`super(...)`** en los constructores de las subclases. |
| **Sobrescritura** | Uso de **`@Override`** en `calculateCost()` y `displayInfo()` para aplicar la lógica de costos específica de cada tratamiento (Ej: tarifa de exfoliación o bono SPA). |
| **Polimorfismo** | En `Main.java`, al iterar sobre un array de tipo **`Service`** (el padre), se llama dinámicamente al método `displayInfo()` de la clase hija correcta. |