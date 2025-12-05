import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 04: HERENCIA Y POLIMORFISMO =====");

        // 1. Crear objetos específicos (Hijos)
        FacialTreatment facialOro = new FacialTreatment("F-01", "Facial Lifting", 100000.0, 90, 30000.0);
        ManicurePedicure spaArt = new ManicurePedicure("M-01", "Spa Manicure", 40000.0, 60, true);
        ManicurePedicure basico = new ManicurePedicure("M-02", "Manicure Básica", 30000.0, 40, false);

        // 2. Usar Polimorfismo: ArrayList de tipo Service (el Padre)
        ArrayList<Service> servicios = new ArrayList<>();
        servicios.add(facialOro);
        servicios.add(spaArt);
        servicios.add(basico);

        // 3. Demostración de Polimorfismo (Vinculación Dinámica)
        System.out.println("\n--- Lista Polimórfica de Servicios ---");
        for (Service s : servicios) {
            // Llama a la versión correcta de calculateFinalPrice() (sobrescrita)
            System.out.printf("Servicio: %s | Base: $%.0f | Final: $%.0f%n", 
                              s.getName(), 
                              s.getBasePrice(), 
                              s.calculateFinalPrice());
        }
        
        System.out.println("=====================================================");
    }
}