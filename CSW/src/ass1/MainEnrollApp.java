//Q10
package ass1;

import java.util.ArrayList;
import java.util.List;

public class MainEnrollApp {

    interface EnrollmentSystem {
        void enrollStudent(Student student, Course course);
        void dropStudent(Student student, Course course);
        void displayEnrollmentDetails(Course course);
    }

    static class Student {
        private String studentId;
        private String name;

        public Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }
    }

    static class Course {
        private String courseCode;
        private String courseName;
        private List<Student> enrolledStudents;

        public Course(String courseCode, String courseName) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.enrolledStudents = new ArrayList<>();
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public List<Student> getEnrolledStudents() {
            return enrolledStudents;
        }

        public void addStudent(Student student) {
            enrolledStudents.add(student);
        }

        public void removeStudent(Student student) {
            enrolledStudents.remove(student);
        }
    }

    static class Enrollment implements EnrollmentSystem {

        @Override
        public void enrollStudent(Student student, Course course) {
            course.addStudent(student);
            System.out.println(student.getName() + " has been enrolled in " + course.getCourseName());
        }

        @Override
        public void dropStudent(Student student, Course course) {
            course.removeStudent(student);
            System.out.println(student.getName() + " has been dropped from " + course.getCourseName());
        }

        @Override
        public void displayEnrollmentDetails(Course course) {
            System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
            System.out.println("Enrolled Students:");
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("- " + student.getName() + " (" + student.getStudentId() + ")");
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("S101", "Alice");
        Student student2 = new Student("S102", "Bob");

        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("MATH101", "Calculus I");

        Enrollment enrollmentSystem = new Enrollment();

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student1, course2);

        System.out.println("\nDisplaying enrollment details for CS101:");
        enrollmentSystem.displayEnrollmentDetails(course1);

        System.out.println("\nDropping Bob from CS101:");
        enrollmentSystem.dropStudent(student2, course1);

        System.out.println("\nDisplaying enrollment details for CS101 after dropping Bob:");
        enrollmentSystem.displayEnrollmentDetails(course1);
    }
}
