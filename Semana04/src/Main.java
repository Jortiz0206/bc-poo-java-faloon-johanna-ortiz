package semana04;

public class Main {
    public static void main(String[] args) {

        BeautyProfessional[] staff = new BeautyProfessional[3];

        staff[0] = new Esthetician("Johanna", "EST-101", 1500000, 4);
        staff[1] = new MakeupArtist("Valentina", "MUA-202", 1300000, 6);
        staff[2] = new Esthetician("Mariana", "EST-303", 1800000, 2);

        for (BeautyProfessional pro : staff) {
            pro.showInfo();
            System.out.println("Salary: $" + pro.calculateSalary());
            System.out.println("-----------------------------");
        }
    }
}
