package semana04;

public class MakeupArtist extends BeautyProfessional {

    private int eventCount;

    public MakeupArtist(String name, String id, double baseSalary, int eventCount) {
        super(name, id, baseSalary);
        this.eventCount = eventCount;
    }

    @Override
    public double calculateSalary() {
        double eventBonus = eventCount * 50000; // $50.000 per event
        return baseSalary + eventBonus;
    }
}
