# Proyecto Final (Semanas 01 a 09)

## Cierre del Proyecto: Patrones de Diseño
La Semana 09 marca la finalización del proyecto con la implementación de patrones de diseño, asegurando que el sistema sea eficiente y escalable.

## Implementaciones Finales

### 1. Patrón Singleton (BeautyCenter.java)
* **Propósito:** Garantizar que solo exista UNA instancia de la clase gestora en todo el sistema, asegurando la coherencia de la lista de citas (`ArrayList`).
* **Implementación:** Constructor `private` y uso de `public static getInstance()`.

### 2. Patrón Factory Method (ServiceFactory.java)
* **Propósito:** Centralizar la lógica de creación de objetos complejos (`FacialTreatment`, `ManicurePedicure`).
* **Beneficio:** El código principal (`Main.java`) no necesita saber cómo construir cada tipo específico de servicio, solo le pide al Factory que lo cree.

## ✅ Estado Final del Proyecto

El código compila y ejecuta todas las demostraciones de POO desde la Semana 01 hasta la Semana 09.
