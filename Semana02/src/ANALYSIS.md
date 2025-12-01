# Semana 02 - Análisis General

En esta semana se trabajó el diseño de clases aplicando:
- Identificación de objetos del dominio.
- Creación de clases con atributos.
- Constructores.
- Métodos básicos para mostrar información.

## Objetos principales del sistema
El dominio corresponde a un "Beauty Center" (centro de estética).  
Se identificaron las siguientes clases:

1. **Customer**
2. **BeautyService**
3. **Appointment**

Cada clase representa un concepto real del negocio.

---

## Customer
Representa a los clientes del centro de estética.

**Atributos**
- name
- email
- phone

**Constructor**
- Inicializa los valores del cliente.

**Método**
- `showInfo()` imprime los datos del cliente.

---

## BeautyService
Representa los servicios ofrecidos en el negocio.

**Atributos**
- serviceName
- duration
- price

**Constructor**
- Inicializa todos los atributos.

**Método**
- `showInfo()` imprime servicio, duración y precio.

---

## Appointment
Representa una cita asignada a un cliente.

**Atributos**
- date
- time
- customer (objeto Customer)
- service (objeto BeautyService)

**Constructor**
- Recibe toda la información necesaria para crear la cita.

**Método**
- `showInfo()` muestra datos completos de la cita.

---

## Conclusiones
- Se identificaron correctamente los objetos del sistema.
- Se aplicó creación de clases simples con atributos y métodos.
- Se utilizó composición: Appointment usa Customer y BeautyService.
- El diseño sienta las bases para aplicar encapsulación en la Semana 3.
