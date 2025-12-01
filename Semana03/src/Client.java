public class Client {
    private String fullName;
    private String email;
    private String phone;

    // Constructor completo
    public Client(String fullName, String email, String phone) {
        setFullName(fullName);
        setEmail(email);
        setPhone(phone);
    }

    // Constructor básico
    public Client(String fullName, String email) {
        this(fullName, email, "No phone");
    }

    // Constructor mínimo
    public Client(String fullName) {
        this(fullName, fullName.toLowerCase().replace(" ", "") + "@gmail.com");
    }

    // Getters
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    // Setters con validación
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() < 6) {
            throw new IllegalArgumentException("Invalid phone");
        }
        this.phone = phone;
    }
}
