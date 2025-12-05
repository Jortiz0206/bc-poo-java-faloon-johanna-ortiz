# Proyecto Final: Sistema de Gestión de Centro de Estética y Belleza

## 👤 Información del Estudiante
| Campo | Valor |
|-------|-------|
| **Nombre** | Faloon Johanna Ortiz Londoño |
| **Ficha** | 3228970A |
| **Dominio** | Centro de Estética y Belleza "Belleza Total" |
| **Fecha** | [Insertar Fecha de Entrega] |
---

## 📝 Descripción del Sistema
Este sistema de gestión fue diseñado para manejar la agenda, los servicios y la facturación del centro de estética. El proyecto resuelve el problema de la gestión manual de citas y la inconsistencia de precios mediante la aplicación rigurosa de los principios de la Programación Orientada a Objetos (POO). El sistema está diseñado para ser extensible, permitiendo agregar nuevos tipos de servicios y personal sin modificar el código base.

## 🏗️ Arquitectura del Proyecto
### Diagrama de Clases
![Diagrama de Clases](docs/diagrama-clases.png)

### Estructura de Paquetes
El código sigue el estándar `com.belleza.[módulo]` para asegurar la modularidad y el control de dependencias.

| Paquete | Contenido | Clases |
|---------|-----------|--------|
| `modelo` | Entidades del negocio y Relaciones | `Service`, `Client`, `Esthetician`, `Appointment`, `FacialTreatment`, etc. |
| `servicio` | Lógica de negocio y Control | **`BeautyCenter` (Singleton)**, **`ServiceFactory`** (Patrón), `DataPersistence` |
| `excepciones` | Clases de Error | `ServicioInvalidoException`, `CitaNoDisponibleException` |

---

## 🧬 Aplicación de Conceptos POO

### Encapsulación (S03)
- Todos los atributos son `private` (Ej., `commissionRate`, `basePrice`).
- **Validaciones implementadas:**
  1. Validación de **rango** en la tasa de comisión (0% - 50%).
  2. Validación de **formato** para la dirección de correo electrónico (@).
  3. Validación de valores **positivos** en precios y duraciones (S07).

### Herencia (S04)
| Clase Padre | Clases Hijas | Atributos Heredados |
|-------------|--------------|---------------------|
| `Service` | `FacialTreatment`, `ManicurePedicure` | `basePrice`, `name`, `durationMinutes` |
| **Abstracción (S06)** | `ServiceElement` (Abstracta) es la base de `Esthetician`. | `name`, `internalCode` |

### Polimorfismo (S05)
**Sobrescritura (@Override):**
- `calculateFinalPrice()` en `FacialTreatment` (aplica impuesto/costo extra).
- `calculateFinalPrice()` en `ManicurePedicure` (aplica recargo por *nail art*).
**Sobrecarga (Overload):**
- `findService(String)` y `findService(double, double)` en `BeautyCenter`.

### Abstracción (S06)
| Tipo | Nombre | Implementaciones |
|------|--------|------------------|
| Clase abstracta | `ServiceElement` | `Esthetician`, `FacialTreatment` |
| Interface | **`Billable`** | `FacialTreatment`, `ManicurePedicure` |
| Interface | **`Schedulable`** | `FacialTreatment`, `Esthetician` |

### Colecciones (S02, S08)
| Colección | Tipo | Propósito |
|-----------|------|-----------|
| `citasPorCodigo` | `Map<String, Appointment>` | **Búsqueda O(1)** por código de cita. |
| `historialCitas` | `List<Appointment>` | Mantener orden cronológico de las citas. |

### Patrones de Diseño (S09)
* **Singleton:** Aplicado a la clase `BeautyCenter` para mantener una única lista maestra de citas.
* **Factory Method:** Aplicado a `ServiceFactory` para crear objetos `FacialTreatment` o `ManicurePedicure` de forma polimórfica.

---

## 🚀 Cómo Ejecutar

### Compilación (Terminal)
```bash
# Ejecutar desde la carpeta proyecto-final/
javac src/com/belleza/*/*.java src/com/belleza/Main.java

### Ejecución (Terminal)
```bash
java -cp . com.belleza.Main