# 📄 README.md - Semana 03: Herencia y Polimorfismo

## Objetivo
Aplicar el principio de **Herencia** para crear una jerarquía de clases eficiente y demostrar el **Polimorfismo** dentro del sistema.

## Implementaciones Clave

### 1. Clase Base (Person.java)
Se introdujo la clase **Person** para encapsular atributos comunes (`id`, `name`) y métodos genéricos (`getInfo()`). Se define como `abstract` para asegurar que solo se creen objetos de sus subclases.

### 2. Herencia de Nivel 1
Las clases **Client.java** y **Esthetician.java** ahora utilizan la palabra clave `extends Person`, heredando automáticamente sus atributos y métodos. Se utiliza `super()` en el constructor para inicializar los atributos del padre.

### 3. Herencia de Nivel 2 y Polimorfismo
La clase **LoyaltyClient.java** extiende a **Client**, creando una jerarquía multinivel. Esta clase:
* Introduce lógica específica (puntos de lealtad).
* Demuestra la **Sobreescritura de Métodos** (`@Override getInfo()`), un pilar del Polimorfismo, adaptando el comportamiento de la clase padre.