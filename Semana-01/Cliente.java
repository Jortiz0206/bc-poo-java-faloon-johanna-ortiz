public class Cliente {
    // Atributos (3-5 mínimo requeridos)
    private int idCliente;
    private String nombre;
    private String telefono;
    private String historialFidelidad; 

    // Constructor completo
    public Cliente(int idCliente, String nombre, String telefono, String historialFidelidad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.historialFidelidad = historialFidelidad;
    }

    // Método de negocio: Define el comportamiento de ser VIP
    public boolean esClienteVIP() {
        // Regla de negocio: si su historial menciona "2023" o antes, es VIP
        return historialFidelidad.contains("2023") || historialFidelidad.contains("2022");
    }

    // Método para mostrar información
    public void mostrarContacto() {
        System.out.println("Cliente ID " + idCliente + ": " + nombre + " | Teléfono: " + telefono);
    }
    
    // Getter
    public String getNombre() { return nombre; }
}