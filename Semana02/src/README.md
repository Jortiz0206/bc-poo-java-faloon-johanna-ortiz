# Semana 02 - Clases Básicas

## Objetivo
Crear las primeras clases del proyecto aplicando:
- Atributos
- Constructores
- Métodos simples
- Composición entre objetos

---

## Clases Implementadas

### 1. Customer
```java
public class Customer {
    public String name;
    public String email;
    public String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("Customer: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
