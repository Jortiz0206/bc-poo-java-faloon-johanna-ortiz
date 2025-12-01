package semana04;

public class Esthetician extends BeautyProfessional {

    private int yearsExperience;

    public Esthetician(String name, String id, double baseSalary, int yearsExperience) {
        super(name, id, baseSalary); // Call parent constructor
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double calculateSalary() {
        double bonus = baseSalary * 0.04 * yearsExperience; // 4% per year
        return baseSalary + bonus;
    }
}

