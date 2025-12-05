# ANALISIS.MD - Semana 04: Justificación de Herencia

## 1. Identificación de la Jerarquía
**Relación:** La relación implementada es de tipo **"es-un"**: Un `FacialTreatment` ES UN `Service`.

* **Clase Padre (Superclase):** `Service.java`
* **Subclases:** `FacialTreatment.java` y `ManicurePedicure.java`

## 2. Implementación de Atributos y Métodos

### Atributos
El atributo `basePrice` fue declarado como **`protected`** en la clase `Service`.
* **Justificación:** Esto permite que las clases hijas (`FacialTreatment`, `ManicurePedicure`) accedan directamente a este campo para calcular el precio final sin necesidad de utilizar métodos `public` (getters) o romper la encapsulación de otros atributos (`serviceCode`).

### Polimorfismo por Sobrescritura
El método **`calculateFinalPrice()`** fue creado en el Padre (`Service`) y sobrescrito en las clases hijas.

| Clase | Lógica de Cálculo de Precios |
| :--- | :--- |
| **`Service`** | Devuelve el precio base. |
| **`FacialTreatment`** | Devuelve (Precio Base + 5% Impuesto) + Costo de Lujo. |
| **`ManicurePedicure`** | Devuelve Precio Base + Recargo si `includesNailArt` es verdadero. |

## 3. Beneficios del Diseño
* **Reutilización de Código:** Los constructores de las clases hijas reutilizan la inicialización de los atributos base (`code`, `name`, `price`) a través de la llamada **`super(...)`**.
* **Extensibilidad (Polimorfismo):** Se puede agregar cualquier nuevo servicio (ej., `BodyTreatment`) en el futuro, y los métodos que procesan la facturación (`SystemProcessor` en S05) lo manejarán automáticamente sin requerir modificación de su código.
## 4. Justificación del Empaquetado

Para garantizar la portabilidad y evitar errores de compilación en diferentes entornos de desarrollo (CMD), el código de esta semana se mantiene temporalmente en el **"Paquete por Defecto"** (sin la línea `package`).

**Sin embargo, la estructura correcta de paquetes para este proyecto sería:**

* **Archivo:** `FacialTreatment.java`
* **Línea Correcta:** `package com.belleza.modelo;`

* **Archivo:** `BeautyCenter.java`
* **Línea Correcta:** `package com.belleza.servicio;`

