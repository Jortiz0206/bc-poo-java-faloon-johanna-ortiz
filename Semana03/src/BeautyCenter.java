import java.util.ArrayList;

public class BeautyCenter {
    private String name;
    private ArrayList<Appointment> appointments;

    // Constructor
    public BeautyCenter(String name) {
        setName(name);
        this.appointments = new ArrayList<>();
    }

    // Getter
    public String getName() { return name; }

    // Setter con validación
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Center name cannot be empty");
        }
        this.name = name;
    }

    // Métodos de negocio
    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }
        appointments.add(appointment);
    }

    public int totalAppointments() {
        return appointments.size();
    }
}
