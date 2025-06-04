import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int id) {
        students.add(new Student(name, id));
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public void showAllReports() {
        for (Student s : students) {
            System.out.println("\n------------------");
            s.printReport();
        }
    }
}
