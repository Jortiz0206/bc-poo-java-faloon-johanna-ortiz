# ANALISIS.md - Semana 05: Análisis Funcional

## 1. Sobrecarga de Métodos (Overloading)

**Implementación:** Se agregó en la clase **`BeautyCenter`**.
* **Propósito:** Cumplir el requisito de tener múltiples métodos con el mismo nombre pero diferente firma (parámetros) para manejar distintos tipos de consultas.
* **Beneficio:** Mejora la interfaz de usuario de la clase gestora. Un usuario puede buscar por el ID de producto (String) o por el rango de precios (double, double) sin aprender nuevos nombres de métodos.

## 2. Sobrescritura y Polimorfismo Dinámico (Overriding)

### Método Sobrescrito
El método **`calculateFinalPrice()`** fue creado en el Padre (`Service`) y modificado en las clases hijas.

| Clase | Comportamiento Específico Sobrescrito |
| :--- | :--- |
| **`FacialTreatment`** | Implementa la lógica de precio con un impuesto extra (5%) y suma el costo de los ingredientes de lujo. |
| **`ManicurePedicure`** | Implementa una lógica condicional, aplicando un recargo fijo si el atributo `includesNailArt` es verdadero. |

### Vinculación Dinámica
* **Demostración:** La clase **`SystemProcessor`** (con su método `facturarServicio(Service servicio)`) utiliza la vinculación dinámica.
* **Beneficio:** En tiempo de ejecución, Java determina qué lógica de precio es la correcta (la del `FacialTreatment` o la del `ManicurePedicure`) basándose en el objeto real, no en el tipo de referencia. Esto asegura que el código de facturación sea flexible y escalable (cumple OCP).