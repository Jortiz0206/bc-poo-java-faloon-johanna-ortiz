# 🛡️ Semana 03: Encapsulación, Constructores y Validaciones

## 🎯 Enfoque de la Semana
Esta entrega se centra en refactorizar las clases clave (`Esthetician` y `Client`) para aplicar los principios de la **Encapsulación** y la **Sobrecarga de Constructores**, haciendo el código más robusto y seguro.

## 🏗️ Implementaciones Clave

### 1. Encapsulación Completa
* Todos los atributos de `Esthetician.java` y `Client.java` fueron declarados como **`private`**.
* El acceso y modificación de los datos se realiza exclusivamente a través de métodos **`public`** (Getters y Setters).

### 2. Sobrecarga de Constructores
Se implementaron **dos constructores diferentes** en ambas clases:
* Un constructor **completo** para inicializar todos los atributos.
* Un constructor **parcial** que llama al constructor completo para asignar valores por defecto a los atributos opcionales (ej., asignando un 5% de comisión base o "N/A" para el teléfono/email).

### 3. Validaciones Integradas
* **`Esthetician`**: Se añadió validación en el *setter* de `commissionRate` para asegurar que el porcentaje esté siempre dentro del rango permitido (0% - 50%).
* **`Client`**: Se añadió validación en el *setter* de `email` para verificar el formato básico (`@`) antes de almacenar el dato.

## ✅ Demostración
La clase `Main.java` demuestra el uso de los diferentes constructores (`Cliente` completo vs. `Cliente` mínimo) y prueba la validación integrada en el *setter* de `Esthetician`.