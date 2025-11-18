# 📉 Jerarquía de Clases - Semana 04

## 1. Diagrama de Jerarquía

    Service
        |
    +---+---+
    |       |
    |       |
FacialTreatment ManicurePedicure

## 2. Justificación de la Jerarquía
Elegimos la jerarquía **`Service`** porque en un Centro de Estética, todos los tratamientos (Faciales, Manicure, Corporales) son fundamentalmente un "Servicio". Esto nos permite manejar atributos comunes (código, nombre, precio base) en un solo lugar y diferenciar la lógica de costo (impuestos, tarifas extra) en las subclases.

## 3. Atributos Heredados
Los siguientes atributos de la clase `Service` son accesibles para las clases hijas:
- `serviceCode` (String)
- `name` (String)
- `basePrice` (double)

## 4. Métodos Sobrescritos
El método clave sobrescrito en ambas subclases es `calculateCost()`:

| Subclase | Lógica Adicional Implementada |
| :--- | :--- |
| **`FacialTreatment`** | Añade una tarifa fija de $15000 (`EXFOLIANT_FEE`) al costo base por insumos. |
| **`ManicurePedicure`** | Aplica un bono del 20% (`SPA_BONUS`) al costo base si el tratamiento es de tipo SPA. |

También se sobrescribió `displayInfo()` para mostrar los detalles específicos (tipo de piel, si es SPA) de cada tratamiento.