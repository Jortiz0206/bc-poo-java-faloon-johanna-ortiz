# README.md - Semana 06: Abstracción e Interfaces

## Objetivo
Implementar los pilares de diseño avanzado: **Clases Abstractas** e **Interfaces**. Esto mejora la estructura del código para hacerlo más extensible y modular (Principios SOLID).

## Implementaciones Clave

### 1. Abstracción (ServiceElement.java)
* **Base:** Se creó la clase abstracta `ServiceElement` para centralizar atributos comunes y forzar la especialización mediante el método abstracto `getRoleDescription()`.

### 2. Interfaces (Billable y Schedulable)
* **Contratos:** Se definieron interfaces para separar responsabilidades. Por ejemplo, `Billable.java` define el contrato de costo, y `Schedulable.java` define el contrato de tiempo.

### 3. Polimorfismo
* La clase `FacialTreatment.java` demuestra la **implementación múltiple**, ya que cumple ambos contratos (`Billable` y `Schedulable`), y puede ser procesada por cualquier módulo del sistema (Facturación o Agenda) sin depender de su clase concreta.

##  Nota de Entrega
Debido a las restricciones del entorno, todos los archivos `.java` se mantienen juntos en esta carpeta, sin líneas `package` ni subcarpetas internas. La justificación de la arquitectura modular se encuentra en el documento de análisis.