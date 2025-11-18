# 🌟 Semana 02: Clases, Objetos y Relaciones - Centro de Estética

## 🎯 Objetivo
Ampliación del sistema "Belleza Total" para implementar nuevas clases, relaciones y colecciones (`ArrayList`), cumpliendo con los requisitos de la Semana 02.

## 📁 Clases Implementadas
1.  **`Esthetician.java`**: Representa al personal. (Clase Nueva 1)
2.  **`Client.java`**: Representa a la persona que recibe el servicio. (Clase Nueva 2)
3.  **`Appointment.java`**: Clase de relación que asocia un `Client`, un `Esthetician` y un `BeautyService`.
4.  **`BeautyCenter.java`**: Clase Gestora que utiliza un `ArrayList<Appointment>` para manejar todas las citas programadas.

## ✅ Funcionalidades Demostradas
* **Relaciones:** La clase `Appointment` demuestra la relación de agregación al contener referencias a objetos `Client`, `Esthetician` y `BeautyService`.
* **Colecciones:** La clase `BeautyCenter` usa `ArrayList` para gestionar y listar múltiples citas.
* **Métodos Complejos:** `Appointment.calculateTotalCost()` realiza un cálculo que incluye la tarifa base del servicio y una tarifa administrativa.
* **Validaciones:** El constructor de `Esthetician` y `Client` incluye validaciones básicas para asegurar la integridad de los datos.