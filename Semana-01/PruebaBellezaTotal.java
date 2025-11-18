public class PruebaBellezaTotal {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SISTEMA BELLEZA TOTAL - S1 =====");

        // 1. Instanciar Objeto Principal (Servicio)
        Servicio facial = new Servicio("S-001", "Limpieza Facial Profunda", 80000.0, 60);
        
        // 2. Instanciar Objeto Secundario (Cliente)
        Cliente nuevoCliente = new Cliente(101, "Andrea Ramírez", "3001234567", "Inicio: 2024-10-01");
        Cliente clienteFiel = new Cliente(102, "Marcela Díaz", "3109876543", "Inicio: 2023-01-05");

        // --- Demostración de interacciones y métodos ---
        
        System.out.println("\n--- 1. Servicio Disponible ---");
        facial.mostrarDetalles();
        
        System.out.println("\n--- 2. Interacciones con Clientes ---");
        
        // Prueba con cliente nuevo
        nuevoCliente.mostrarContacto();
        if (nuevoCliente.esClienteVIP()) {
            System.out.println("¡Error en la lógica! No debería ser VIP.");
        } else {
            System.out.println("=> No califica para descuento VIP.");
        }
        
        // Prueba con cliente fiel
        clienteFiel.mostrarContacto();
        if (clienteFiel.esClienteVIP()) {
            System.out.println("=> ¡Es cliente VIP!");
            // Uso de un método del objeto Servicio basado en el estado del objeto Cliente
            double precioFinal = facial.calcularPrecioConDescuento(0.15); 
            System.out.println("   Aplicando 15% Descuento VIP al servicio: $" + precioFinal);
        }
        
        System.out.println("\n=============================================");
    }
}