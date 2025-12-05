# Portafolio de Logros POO (Semanas 01-09)

## Sistema de Gestión: Centro de Estética y Belleza "Belleza Total"

## Información del Estudiante

| Campo     | Valor                                           |
|-----------|-------------------------------------------------|
| **Nombre** | Faloon Johanna Ortiz Londoño                   |
| **Registro** | 3228970A                                     |
| **Dominio** | Centro de Estética y Belleza "Belleza Total" |
| **Estado** | Proyecto Final Integrado (Semanas 01–09)       |

***

## Descripción General del Sistema

Este proyecto implementa un sistema completo para la gestión de citas y servicios en un centro de estética.  
Se diseñó siguiendo principios sólidos de **Programación Orientada a Objetos (POO)**, integrando:

- Arquitectura modular basada en paquetes
- Manejo avanzado de colecciones
- Patrones de diseño profesionales
- Escalabilidad y robustez del código

El resultado es una plataforma que centraliza y organiza toda la operación de un centro de estética moderno.

***


## Avance Técnico: Integración por Semanas

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
# Diagrama UML — Sistema de Gestión "Belleza Total"

A continuación se presenta el modelo UML del sistema, organizado en tablas para facilitar la lectura y documentar correctamente la arquitectura POO del proyecto.

---

## Clase: `Client`
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| id | int | Identificador único del cliente |
| name | String | Nombre completo |
| email | String | Correo (validación de formato) |
| phone | String | Teléfono de contacto |

| Método | Descripción |
|--------|-------------|
| getInfo() | Retorna información general |
| validateEmail() | Valida el formato del correo |

---

## Clase: `Esthetician`
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| id | int | ID del esteticista |
| name | String | Nombre |
| specialty | String | Especialidad (Uñas, Faciales, etc.) |

| Método | Descripción |
|--------|-------------|
| getProfile() | Muestra el perfil del profesional |

---

## Clase Abstracta: `Service`
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| id | int | ID del servicio |
| name | String | Nombre |
| basePrice | double | Precio base |
| durationMinutes | int | Duración del servicio |

| Método | Descripción |
|--------|-------------|
| calculateFinalPrice() | Método abstracto (cada servicio lo implementa distinto) |
| getSummary() | Retorna datos del servicio |

---

## Clase: `FacialTreatment` (extends Service)
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| skinType | String | Tipo de piel recomendado |

| Método | Descripción |
|--------|-------------|
| calculateFinalPrice() | Calcula precio con recargos especiales |

---

## Clase: `ManicurePedicure` (extends Service)
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| includeNailArt | boolean | Si incluye decoración |

| Método | Descripción |
|--------|-------------|
| calculateFinalPrice() | Calcula extras según decoración |

---

## Clase: `Appointment`
| Atributo | Tipo | Descripción |
|---------|------|-------------|
| id | int | Identificador |
| client | Client | Cliente asociado |
| esthetician | Esthetician | Profesional asignado |
| service | Service | Servicio polimórfico |
| date | LocalDate | Fecha |
| time | LocalTime | Hora |

| Método | Descripción |
|--------|-------------|
| schedule() | Programa la cita |
| cancel() | Cancela la cita |

---

## Clase Singleton: `BeautyCenter`
| Responsabilidad | Descripción |
|-----------------|-------------|
| Gestión central | Maneja clientes, servicios y citas |
| Estado único | Solo existe una instancia |

| Método | Descripción |
|--------|-------------|
| getInstance() | Retorna la instancia única |
| addClient() | Agrega clientes |
| addAppointment() | Registra citas |
| findService() | Búsqueda polimórfica de servicios |

---

## Clase Factory: `ServiceFactory`
| Método | Descripción |
|--------|-------------|
| createService(type) | Crea instancias polimórficas (Facial, Manicure, etc.) |

---

## 🔗 Relaciones UML del Sistema
| Clase A | Relación | Clase B | Descripción |
|---------|----------|---------|-------------|
| Client | 1..* | Appointment | Un cliente puede tener varias citas |
| Esthetician | 1..* | Appointment | Un esteticista atiende varias citas |
| Service | 1..* | Appointment | Un servicio puede aparecer en varias citas |
| Service | Herencia | FacialTreatment, ManicurePedicure | Especialización |
| BeautyCenter | Usa | Client, Service, Appointment | Gestor principal |
| ServiceFactory | Crea | Service | Creación polimórfica |

---

## Guía de Ejecución

### Requisitos
* El código fuente se encuentra en la estructura de paquetes: `src/com/belleza/[módulo]`.
* Java JDK 11 .

### Compilación (Desde la Terminal en la carpeta `proyecto-final/src`)
```bash
* javac com/belleza/*/*.java com/belleza/Main.javDiagrama UML — Sistema de Gestión “Belleza Total”


