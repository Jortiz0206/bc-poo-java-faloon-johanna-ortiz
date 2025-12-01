# ANÁLISIS - Semana 03  
## Encapsulación, Constructores y Validaciones

En esta semana tomé las clases creadas en la Semana 02 (Client, BeautyService, Appointment y BeautyCenter) y las mejoré aplicando principios de Encapsulación, Sobrecarga de Constructores y Validaciones.

---

## 1. Encapsulación
Apliqué encapsulación completa en todas las clases:

- Todos los atributos ahora son **private**.
- Implementé **getters** para obtener información de forma controlada.
- Los **setters** incluyen validaciones para asegurar que los datos sean correctos antes de asignarse.
- Se agregaron **métodos auxiliares privados** cuando fue necesario.

Esto hace que los objetos sean más seguros y evita que el sistema reciba datos incorrectos (como precios negativos, correos sin “@”, nombres vacíos, etc.).

---

## 2. Sobrecarga de Constructores
Cada clase ahora tiene **varios constructores**:

### Client
- Completo (nombre, email, teléfono)
- Básico (nombre, email)
- Mínimo (solo nombre → genera un email automático)

### BeautyService
- Completo (code, name, price)
- Básico (code, name → precio por defecto)
- Mínimo (solo name → crea un code automático y precio por defecto)

### Appointment
- Completo (client, service, date)
- Básico (client, service)

### BeautyCenter
- Constructor único pero validado

Esto permite crear objetos con diferentes niveles de información y mejora la flexibilidad del sistema.

---

## 3. Validaciones
Se agregaron validaciones clave:

- Strings no vacíos
- Precios positivos
- Email con “@”
- Teléfonos con mínimo de dígitos
- Objetos no nulos
- Código del servicio con longitud mínima
- Fechas con formato básico válido

Esto mejora la calidad de los datos y evita errores en ejecución.

---

## 4. Mejora General del Diseño
Con la encapsulación y validaciones:

- Las clases quedaron más profesionales
- Se facilita la herencia (Semana 04)
- Se garantiza mayor orden y seguridad
- Se estandariza el proceso de creación de objetos
- El sistema es más confiable y modular

---

## 5. Resultado Final
El sistema ahora está listo para crecer, soporta datos seguros y cumple con todos los requisitos de la Semana 03.
