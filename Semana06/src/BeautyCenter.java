import java.util.ArrayList; 

public class BeautyCenter {
    private String centerName;
    private ArrayList<Appointment> appointments; 
    
    public BeautyCenter(String centerName) {
        this.centerName = centerName;
        this.appointments = new ArrayList<>();
    }
    // ... métodos addAppointment() y listAppointmentsSummary()
}