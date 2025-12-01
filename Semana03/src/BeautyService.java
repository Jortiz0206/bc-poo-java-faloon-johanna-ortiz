public class BeautyService {
    private String code;
    private String name;
    private double price;

    // Constructor completo
    public BeautyService(String code, String name, double price) {
        setCode(code);
        setName(name);
        setPrice(price);
    }

    // Constructor básico
    public BeautyService(String code, String name) {
        this(code, name, 50000);
    }

    // Constructor mínimo
    public BeautyService(String name) {
        this("SRV-" + name.substring(0, 2).toUpperCase(), name, 50000);
    }

    // Getters
    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setters con validación
    public void setCode(String code) {
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("Code must have at least 3 characters");
        }
        this.code = code;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Service name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
}
