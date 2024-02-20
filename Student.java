public class Student extends StudentCourses {
    String name;
    String department;

    public void displayName() {
        System.out.println("Student Name: " + name);
        System.out.println("Student department: " + department);
     }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "SUDEEP S CHANAL";
        s.department = "BCA";
        s.displayName();
        System.out.println("THE COURSES REGISTERED ARES:");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();

    }
}
