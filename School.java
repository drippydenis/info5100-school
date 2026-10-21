import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
    private List<Student> studentRoster = new ArrayList<>();
    private List<Person> personRoster = new ArrayList<>();

    // Add methods
    public void addToStudentList(Student s) {
        studentRoster.add(s);
    }

    public void addToPersonList(Student s) {
        personRoster.add(s);
    }

    // Sort methods for the Student list
    public void sortStudentListById() {
        studentRoster.sort(Comparator.comparingInt(Student::getId));
    }

    public void sortStudentListByAge() {
        studentRoster.sort(Comparator.comparingInt(Student::getAge));
    }

    public void sortStudentListByLastName() {
        studentRoster.sort(Comparator.comparing(Student::getLastName));
    }

    public void sortStudentListByGpa() {
        studentRoster.sort(Comparator.comparingDouble(Student::getGpa));
    }

    // Sort methods for the Person list
    public void sortPersonListById() {
        personRoster.sort(Comparator.comparingInt(Person::getId));
    }

    public void sortPersonListByAge() {
        personRoster.sort(Comparator.comparingInt(Person::getAge));
    }

    public void sortPersonListByLastName() {
        personRoster.sort(Comparator.comparing(Person::getLastName));
    }

    public void sortPersonListByGpa() {
        // Person has no GPA, so we cast each element to Student
        personRoster.sort(Comparator.comparingDouble(p -> ((Student) p).getGpa()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Student List ---\n");
        for (Student s : studentRoster) {
            sb.append(s).append("\n");
        }
        sb.append("--- Person List ---\n");
        for (Person p : personRoster) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}