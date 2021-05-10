package labor12_3;

public class Student {
    private String firstName;
    private String lastName;
    private int ID;
    private double matek;
    private double magyar;
    private double roman;
    private double atlag;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public Student(int id, String trim, String trim1) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    public double getMatek() {
        return matek;
    }

    public double getMagyar() {
        return magyar;
    }

    public double getRoman() {
        return roman;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                ", matek=" + matek +
                ", magyar=" + magyar +
                ", roman=" + roman +
                ", atlag=" + atlag +
                '}';
    }
}
