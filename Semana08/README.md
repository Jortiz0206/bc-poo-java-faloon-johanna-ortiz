# README.md - Semana 08: Persistencia de Datos (File I/O)

## Objetivo
Implementar la funcionalidad de **persistencia de datos** en el sistema, asegurando que la colección principal de citas (`ArrayList`) no se pierda al cerrar el programa, utilizando el manejo de archivos (I/O).

## Implementaciones Clave

### 1. Módulo de Persistencia
Se creó la clase **`DataPersistence.java`** en la capa `servicio/` para centralizar toda la lógica de lectura y escritura en archivos de texto, cumpliendo con el **Principio de Responsabilidad Única (SRP)**.

### 2. Guardado y Carga
* **Guardar:** El método `saveAppointments()` escribe las citas en el archivo `agenda_citas.txt` en un formato simple de texto.
* **Cargar:** El método `loadAppointments()` lee el archivo de texto y devuelve una lista de citas al sistema.

### 3. Integración
La clase gestora (`BeautyCenter.java`) se actualizó para llamar a `loadData()` al iniciar y `saveData()` al finalizar el programa, asegurando que el ciclo de vida de los datos sea completo.

## ✅ Estado del Código
El código está listo para compilar y guardar/cargar datos en formato de texto.

## Comando de Ejecución
Desde la carpeta raíz del paquete (`src/com/belleza`):
```bash
java com.belleza.Main