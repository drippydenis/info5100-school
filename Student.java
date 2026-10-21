public class Student extends Person {
    private double gpa;

    public Student(int id, String firstName, String lastName, int age, double gpa) {
        super(id, firstName, lastName, age);
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + gpa;
    }
}