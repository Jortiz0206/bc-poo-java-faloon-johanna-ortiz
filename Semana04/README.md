# README.md - Semana 04: Herencia y Polimorfismo

## Objetivo
Modelar la jerarquía de los servicios del Centro de Belleza, aplicando la **Herencia** para reutilizar código y el **Polimorfismo** para gestionar dinámicamente los precios.

## Jerarquía de Clases
### Clase Padre
* **`Service.java`**: Contiene los atributos comunes (`name`, `code`) y el método polimórfico **`calculateFinalPrice()`**. El atributo `basePrice` se definió como `protected` para ser accesible a los hijos.

### Clases Hijas
* **`FacialTreatment.java`**: Extiende `Service`. Sobrescribe `calculateFinalPrice()` para añadir un impuesto y el costo de ingrediente de lujo.
* **`ManicurePedicure.java`**: Extiende `Service`. Sobrescribe `calculateFinalPrice()` para añadir un recargo fijo si se incluye la decoración (`includesNailArt`).

## ✅ Conceptos Demostrados
* **Herencia:** Uso de `extends` y `super()` para inicializar el constructor padre.
* **Polimorfismo:** El `Main.java` demuestra que un objeto de tipo `Service` (la referencia) puede contener objetos de tipo `FacialTreatment` o `ManicurePedicure` (el objeto real), y el método `calculateFinalPrice()` funciona correctamente para cada uno.