# 📈 Documento de Mejoras - Semana 03

**Estudiante:** Faloon Johanna Ortiz Londoño
**Dominio Asignado:** Centro de Estética y Belleza "Belleza Total"

---

## 1. Encapsulación Completa

Se aplicó encapsulación en las clases `Esthetician.java` y `Client.java`.

* **Implementación:** Todos los atributos fueron declarados como **`private`**.
* **Acceso:** Se crearon métodos **`public`** de tipo *Getter* y *Setter* para controlar el acceso y la modificación de los datos, asegurando que el estado interno de los objetos no pueda ser alterado de forma inesperada.

## 2. Sobrecarga de Constructores

Se implementó la sobrecarga de constructores en ambas clases para ofrecer flexibilidad en la creación de objetos.

* **`Esthetician`**:
    * **Constructor Completo:** Inicializa ID, Nombre, Especialidad y Tasa de Comisión.
    * **Constructor Parcial:** Inicializa solo Nombre y Especialidad, usando el constructor completo para asignar valores por defecto (ID=0, Comisión=0.05).
* **`Client`**:
    * **Constructor Completo:** Inicializa ID, Nombre, Teléfono y Email.
    * **Constructor Mínimo:** Inicializa solo ID y Nombre, asignando valores como "N/A" o `null` a los campos opcionales.

## 3. Implementación de Validaciones

Se integró la lógica de validación para prevenir datos inconsistentes, cumpliendo con las reglas de negocio:

* **`Esthetician.java`:** El método `setCommissionRate()` (y el constructor que lo llama) valida que la tasa de comisión esté siempre en el rango del 0% al 50%. Si la validación falla, lanza una excepción **`IllegalArgumentException`**.
* **`Client.java`:** El método `setEmail()` valida que el formato contenga el caracter `@` antes de asignar el valor al atributo.

---
