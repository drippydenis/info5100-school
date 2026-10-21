public class Main {
    public static void main(String[] args) {
        School school = new School();

        // 5 students for the Student list
        school.addToStudentList(new Student(105, "Emma", "Walker", 22, 3.4));
        school.addToStudentList(new Student(101, "Liam", "Smith", 20, 3.9));
        school.addToStudentList(new Student(104, "Olivia", "Brown", 24, 2.8));
        school.addToStudentList(new Student(103, "Noah", "Johnson", 21, 3.1));
        school.addToStudentList(new Student(102, "Ava", "Davis", 23, 3.6));

        // 5 students for the Person list
        school.addToPersonList(new Student(205, "Mason", "Miller", 25, 3.2));
        school.addToPersonList(new Student(201, "Sophia", "Wilson", 19, 3.7));
        school.addToPersonList(new Student(204, "Lucas", "Moore", 22, 2.9));
        school.addToPersonList(new Student(203, "Mia", "Taylor", 26, 3.5));
        school.addToPersonList(new Student(202, "Ethan", "Anderson", 21, 3.0));

        System.out.println("===== ORIGINAL ORDER =====");
        System.out.println(school);

        school.sortStudentListById();
        school.sortPersonListById();
        System.out.println("===== SORTED BY ID =====");
        System.out.println(school);

        school.sortStudentListByAge();
        school.sortPersonListByAge();
        System.out.println("===== SORTED BY AGE =====");
        System.out.println(school);

        school.sortStudentListByLastName();
        school.sortPersonListByLastName();
        System.out.println("===== SORTED BY LAST NAME =====");
        System.out.println(school);

        school.sortStudentListByGpa();
        school.sortPersonListByGpa();
        System.out.println("===== SORTED BY GPA =====");
        System.out.println(school);
    }
}