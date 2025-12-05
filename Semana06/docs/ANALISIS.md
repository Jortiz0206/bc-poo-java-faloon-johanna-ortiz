# ANALISIS.MD - Semana 06: Justificación de Abstracción y Diseño Modular

## 1. Abstracción vs. Implementación Concreta (Ejercicio 1)

### Clase Abstracta: ServiceElement.java
* **Propósito:** Actuar como plantilla base para todos los elementos que participan en una cita (Servicios o Personal).
* **Diseño:** Se eligió una clase abstracta porque se necesitaba **compartir un estado** (`name`, `internalCode`) y **comportamiento concreto** (`printBaseInfo()`), mientras que la descripción del rol (`getRoleDescription()`) varía obligatoriamente en cada subclase (`Esthetician`, `FacialTreatment`).

## 2. Interfaces y Diseño Modular (Ejercicio 2)

Se utilizaron interfaces para separar las responsabilidades transversales, aplicando los principios **SOLID**.

| Interface | Capacidad | Implementada por | Principio Clave |
| :--- | :--- | :--- | :--- |
| **`Billable.java`** | Generación de Costo y Aplicación de Impuestos. | `FacialTreatment`, `ManicurePedicure` | **ISP (Segregación):** Define un contrato solo para el dinero. |
| **`Schedulable.java`** | Definición de Duración y Logística de Agenda. | `FacialTreatment`, `Esthetician` | **SRP (Responsabilidad Única):** Separa la lógica de tiempo/agenda. |

### Implementación Múltiple
La clase `FacialTreatment.java` implementa **ambas interfaces** (`Billable` y `Schedulable`), demostrando cómo una sola entidad puede cumplir múltiples contratos, lo cual es vital para el Bajo Acoplamiento.

## 3. Nota sobre la Estructura de Paquetes
Para garantizar que el código compile en el entorno de evaluación, el proyecto utiliza el **Paquete por Defecto** (sin líneas `package` o subcarpetas). El diseño de la arquitectura modular, sin embargo, está representado por las clases `ServiceElement`, `Billable`, y `Schedulable`.