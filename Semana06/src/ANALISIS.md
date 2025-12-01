# 📄 ANALISIS.md - Semana 06: Abstracción e Interfaces

## 1. Identificación de Abstracciones (Clase Abstracta)
**Clase Abstracta:** `ServiceElement.java`
* **Propósito:** Actúa como plantilla base para cualquier entidad que participa en la cita (Personal o Servicio). Centraliza atributos comunes (`name`, `idCode`) y obliga a definir el rol (`getRoleDescription`).

## 2. Interfaces Implementadas (SOLID: ISP y SRP)
### Interface 1: `Billable.java`
**Capacidad que define:** Capacidad de generar un costo final.
**Clases que la implementan:** `FacialTreatment`, `ManicurePedicure`.

### Interface 2: `Schedulable.java`
**Capacidad que define:** Capacidad de tener una duración o tiempo de agenda.
**Clases que la implementan:** `FacialTreatment`, `Esthetician`.

## 3. Principios de Diseño
* **Separación de Responsabilidades (SRP/ISP):** La clase `FacialTreatment` implementa dos interfaces (`Billable` y `Schedulable`), demostrando que las responsabilidades de calcular dinero y gestionar tiempo están separadas en contratos específicos (Interfaces).
* **Polimorfismo:** La lista `ArrayList<ServiceElement>` demuestra **LSP**, ya que puede manejar objetos `Esthetician` y `FacialTreatment` a través de la referencia abstracta. tipo real.