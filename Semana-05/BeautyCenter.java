import java.util.ArrayList;

public class BeautyCenter {
    private String centerName;
    private ArrayList<Service> services; // ArrayList polimórfico de tipo Service
    
    public BeautyCenter(String centerName) {
        this.centerName = centerName;
        this.services = new ArrayList<>();
    }

    public void addService(Service service) {
        this.services.add(service);
    }
    
    // --- MÉTODOS DE SOBRECARGA (OVERLOADING) ---
    
    // Sobrecarga 1: Buscar Servicio por Código
    public Service findService(String code) {
        for (Service svc : services) {
            if (svc.getServiceCode().equalsIgnoreCase(code)) {
                return svc;
            }
        }
        return null;
    }

    // Sobrecarga 2: Buscar Servicios por Rango de Precios
    public ArrayList<Service> findService(double minPrice, double maxPrice) {
        ArrayList<Service> results = new ArrayList<>();
        for (Service svc : services) {
            if (svc.getBasePrice() >= minPrice && svc.getBasePrice() <= maxPrice) {
                results.add(svc);
            }
        }
        return results;
    }
    
    public ArrayList<Service> getServices() { return services; }
}