# 📝 POLIMORFISMO.md - Semana 05

**Dominio:** Centro de Estética y Belleza "Belleza Total"

## 1. Sobrecarga de Métodos (Overloading)
Se implementaron 3 métodos sobrecargados en la clase **BeautyCenter** para la búsqueda de servicios:

* **`findService(String code)`:** Búsqueda por código identificador único.
* **`findService(double minPrice, double maxPrice)`:** Búsqueda por rango de precios.
* **`findService(String namePart, boolean exactMatch)`:** Búsqueda por nombre parcial o exacto.

## 2. Sobrescritura de Métodos (Overriding)
Se sobrescribieron dos métodos clave en las subclases de `Service` para aplicar la lógica de costo y tiempo específica de cada tratamiento:

| Método | Clase Padre (`Service`) | Subclase (`FacialTreatment`) | Subclase (`ManicurePedicure`) |
| :--- | :--- | :--- | :--- |
| **`calculateRecargo()`** | Devuelve 5% base. | Devuelve **15%** (insumos químicos). | Devuelve 5% + **10% extra** si es SPA. |
| **`calculatePrepTime()`** | Devuelve 20 minutos. | Devuelve **60 minutos** (tratamiento largo). | Devuelve **45 minutos** (tratamiento estándar). |

## 3. Polimorfismo Dinámico
La clase **`SystemProcessor`** demuestra el polimorfismo dinámico. El método `facturarServicio(Service servicio)` llama a `servicio.calculateRecargo()`. En tiempo de ejecución (vinculación dinámica), Java ejecuta automáticamente la versión correcta del cálculo (la del 15% para Facial, o la del 15% para Pedicure SPA), sin necesidad de usar `if` o `else` para saber el tipo de objeto real.