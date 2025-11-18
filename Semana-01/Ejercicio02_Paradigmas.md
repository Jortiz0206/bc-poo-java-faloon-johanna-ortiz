# 📝 Actividad 2: Comparación de Paradigmas (Ejercicio 02)

---

## 1. Programación Estructurada (PE)

* **Enfoque:** Se basa en una secuencia de instrucciones (funciones) que operan sobre **datos externos y separados**.

### Ejemplo Conceptual (Manejo del Precio de un Servicio)
En la PE, el dato y la acción están desvinculados:

```javascript
// Los datos existen de forma suelta
var precio_servicio = 45000.0;

// Una función opera sobre el dato, sin pertenecerle
function aplicar_iva(precio) {
    return precio * 1.19; // 19% de IVA
}

// Uso: precio_final = aplicar_iva(precio_servicio);