# Semana 03 - Encapsulación y Constructores

Este módulo corresponde a la Semana 03 del curso de Programación Orientada a Objetos.  
El objetivo fue mejorar el proyecto creado en la Semana 02 aplicando:

- Encapsulación completa
- Sobrecarga de constructores
- Validaciones en atributos y métodos
- Documentación técnica de mejoras

---

## 📌 Clases trabajadas
Estas son las clases del dominio de estética:

- **Client** → representa a un cliente del centro de belleza.
- **BeautyService** → representa un servicio estético (facial, uñas, masaje, etc.).
- **Appointment** → reserva que combina cliente + servicio + fecha.
- **BeautyCenter** → gestiona todas las citas del centro.

Todas fueron mejoradas aplicando buena práctica de POO.

---

## 🔒 Encapsulación

Cada atributo se volvió `private`, con:

- **Getters** para leer datos
- **Setters con validaciones**
- Validación de:
  - correos
  - nombres
  - precios positivos
  - teléfonos válidos
  - citas con cliente/servicio no nulos

---

## 🧱 Constructores Sobrecargados

Se añadieron múltiples formas de crear objetos:

### Client
- Completo (nombre, email, teléfono)
- Básico (nombre, email)
- Mínimo (solo nombre → email automático)

### BeautyService
- Completo
- Básico
- Mínimo (nombre → code automático)

### Appointment
- Completo
- Básico (sin fecha)

---

## ✔ Validaciones Implementadas
- Strings no vacíos
- Email válido
- Precio > 0
- Código mínimo de 3 caracteres
- Teléfono con longitud mínima
- Objetos no nulos para relaciones
- Fechas con texto válido

---

## 🧪 Main de prueba

El `Main.java` permite crear un cliente, servicio, cita y registrarlo en el centro.

---

## 📄 Documentos incluidos
- **MEJORAS.md** → Explica cambios hechos esta semana.
- **README.md** → Este archivo.
- **ANÁLISIS.md** → Explica el razonamiento detrás de las mejoras.

---



