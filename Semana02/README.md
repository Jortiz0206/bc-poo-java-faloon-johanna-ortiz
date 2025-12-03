# Semana 02: Relaciones y Colecciones

## Objetivo
Expandir el sistema "Belleza Total" introduciendo nuevas clases, creando relaciones de objetos y utilizando la colección ArrayList para la gestión de datos.

## Implementaciones Clave

### 1. Relaciones de Objeto (Appointment.java)
La clase **Appointment** funciona como el conector principal, estableciendo una **Asociación/Agregación** al contener referencias a los objetos **Client**, **Esthetician**, y **Service** creados en la Semana 01.

### 2. Colecciones (BeautyCenter.java)
La clase **BeautyCenter** actúa como el gestor del negocio, utilizando un **ArrayList<Appointment>** para almacenar todas las citas agendadas y gestionarlas (añadir, listar, contar).

### 3. Nuevas Clases
Se añadieron **Product.java** (para inventario) y **CustomerRecord.java** (para historial del cliente) para enriquecer el modelo del dominio con lógica de negocio específica.

## ✅ Estado del Código

El código está consolidado en la carpeta `src/Semana02/` y es funcional.
