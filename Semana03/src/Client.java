// Archivo: src/Semana03/Client.java

public class Client extends Person { // AHORA HEREDA DE PERSON
    private String phone;

    // El constructor llama al constructor de la clase padre (Person) usando super()
    public Client(int id, String name, String phone) {
        super(id, name); 
        this.phone = phone;
    }

    // Método de negocio propio de Client
    public String getContactInfo() {
        return "Teléfono: " + this.phone;
    }

    // Sobrecarga del método getInfo() (Polimorfismo Básico)
    @Override
    public String getInfo() {
        return super.getInfo() + ", " + this.getContactInfo();
    }
}