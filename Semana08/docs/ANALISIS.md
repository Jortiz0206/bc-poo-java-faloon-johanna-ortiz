## PERSISTENCIA (Documento de Análisis)

# ANALISIS.md - Semana 08: Análisis de Manejo de Archivos

## 1. Justificación de la Arquitectura de Persistencia

**Decisión de Diseño:** Se optó por separar la lógica de almacenamiento de la lógica de negocio.
* **Capa de Servicio (`BeautyCenter.java`):** Sabe *qué* debe guardar (`saveData()`).
* **Capa de Persistencia (`DataPersistence.java`):** Sabe *cómo* guardar (maneja los detalles de `FileWriter` y `PrintWriter`).

Esta separación garantiza que si en el futuro decides cambiar de guardar en un archivo (`.txt`) a guardar en una base de datos, solo tendrás que modificar la clase `DataPersistence`, dejando intacta la lógica de negocio en `BeautyCenter` (**Principio Abierto/Cerrado - OCP**).

## 2. Implementación de I/O de Archivos

### Guardado de Datos (`saveAppointments`)
* Se utiliza **`try-with-resources`** con **`FileWriter`** y **`PrintWriter`** para escribir los datos de la colección (`ArrayList<Appointment>`) en el archivo `agenda_citas.txt`.
* El formato de persistencia es un texto simple (CSV/semicolon-separado), asegurando la portabilidad y fácil inspección.

### Manejo de Excepciones
* Las operaciones de I/O (`save` y `load`) están envueltas en bloques **`try-catch`** para manejar `IOException` y `FileNotFoundException`.
* Esto asegura que el programa no falle si el archivo no existe o si hay un error de lectura/escritura, mejorando la robustez del sistema.

## 3. Integración en el Ciclo de Vida del Programa

El flujo del programa en `Main.java` demuestra el ciclo de persistencia de manera correcta:

1.  **Inicio:** `gestor.loadData()` es lo primero que se llama para cargar datos anteriores.
2.  **Fin:** `gestor.saveData()` es lo último que se llama para guardar las nuevas citas antes de salir.