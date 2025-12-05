# 📚 Portafolio de Logros POO (Semanas 01-09)

## Sistema de Gestión: Centro de Estética y Belleza "Belleza Total"

| Campo | Valor |
|-------|-------|
| **Nombre** | Faloon Johanna Ortiz Londoño |
| **Ficha** | 3228970A |
| **Dominio** | Centro de Estética y Belleza |
| **Estructura** | Paquetes Profesionales (`com.belleza/...`) |

***

## 🧬 Avance Técnico: Integración por Semanas

El código demuestra la **integración total** de los principios de Programación Orientada a Objetos y las técnicas avanzadas de arquitectura de software.

### I. Fundamentos POO (S01 - S03)

| Logro | Concepto Implementado | Clases Clave |
| :--- | :--- | :--- |
| **Base** | **Clases y Atributos** | `Client`, `Esthetician`, `Service`. |
| **Relaciones** | **Asociación y Composición** | `Appointment` (conecta Cliente, Esteticista y Servicio). |
| **Robustez** | **Encapsulación y Validaciones** | Atributos `private`, Sobrecarga y validaciones en constructores. |

### II. Diseño y Arquitectura (S04 - S09)

| Logro | Concepto Implementado | Clase(s)/Patrón Clave |
| :--- | :--- | :--- |
| **Herencia** | **Reuso de Código** | `Service` (Padre), extendida por `FacialTreatment` y `ManicurePedicure`. |
| **Abstracción** | **Acoplamiento Bajo** | Uso de Interfaces (`Billable`) y Clase Abstracta (`ServiceElement`). |
| **Polimorfismo** | **Flexibilidad de Costos** | Sobrescritura (`@Override`) de `calculateFinalPrice()`. |
| **Excepciones** | **Manejo de Errores** | `ServicioInvalidoException` y **Estructura de Paquetes**. |
| **Patrón Singleton**| **Control de Estado** | **`BeautyCenter.java`** (Asegura una única instancia del gestor de agenda). |
| **Patrón Factory** | **Creación Polimórfica** | **`ServiceFactory.java`** (Centraliza la lógica de creación de servicios). |

***

## 🚀 Guía de Ejecución

### Requisitos
* El código fuente se encuentra en la estructura de paquetes: `src/com/belleza/[módulo]`.
* Java JDK 11 o superior.

### Compilación (Desde la Terminal en la carpeta `proyecto-final/src`)
```bash
javac com/belleza/*/*.java com/belleza/Main.java

## Diagrama UML del Sistema

```mermaid
classDiagram
    %% ====== ENTIDADES ======
    class Client {
        -String name
        -String email
        -String phone
        +getName()
        +getEmail()
        +getPhone()
    }

    class Appointment {
        -Client client
        -Service service
        -String date
        -String time
        +getClient()
        +getService()
        +getDate()
        +getTime()
    }

    %% ====== SERVICIOS ======
    class Service {
        <<abstract>>
        -String name
        -double basePrice
        +calculateFinalPrice()
        +getName()
        +getBasePrice()
    }

    class FacialTreatment {
        +calculateFinalPrice()
    }

    class ManicurePedicure {
        +calculateFinalPrice()
    }

    Service <|-- FacialTreatment
    Service <|-- ManicurePedicure

    %% ====== INTERFACES ======
    class Billable {
        <<interface>>
        +calculateFinalPrice()
    }

    class Schedulable {
        <<interface>>
        +schedule()
    }

    Service ..|> Billable
    Appointment ..|> Schedulable

    %% ====== LOGICA DEL SISTEMA ======
    class BeautyCenter {
        <<Singleton>>
        -static BeautyCenter instance
        -List~Service~ services
        -List~Appointment~ appointments
        +getInstance()
        +addService()
        +addAppointment()
        +findService()
    }

    class ServiceFactory {
        +createService(type, name, price)
    }

    BeautyCenter --> Service : gestiona
    BeautyCenter --> Appointment : administra
    ServiceFactory --> Service : crea
