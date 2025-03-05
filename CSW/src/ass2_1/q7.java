package ass2_1;
import java.util.*;

class Student3 {
    String name;
    int rollNo;
    int age;

    public Student3(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Roll No: " + rollNo + " Age: " + age;
    }
}

class StudentRollNoComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

class StudentAgeComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class StudentAgeRollNoComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        int ageComparison = Integer.compare(s1.age, s2.age);
        if (ageComparison == 0) {
            return Integer.compare(s1.rollNo, s2.rollNo);
        }
        return ageComparison;
    }
}

public class q7 {
    public static void main(String[] args) {
        ArrayList<Student3> students = new ArrayList<>();
        students.add(new Student3("Rahul", 1, 29));
        students.add(new Student3("Rohan", 2, 21));
        students.add(new Student3("Ram", 3, 19));
        students.add(new Student3("Raj", 4, 22));
        students.add(new Student3("Ravi", 5, 20));

        students.sort(new StudentAgeComparator());
        System.out.println("Students sorted by Age:");
        for (Student3 s : students) {
            System.out.println(s);
        }

        students.sort(new StudentRollNoComparator());
        System.out.println("\nStudents sorted by Roll No:");
        for (Student3 s : students) {
            System.out.println(s);
        }

        students.sort(new StudentAgeRollNoComparator());
        System.out.println("\nStudents sorted by Age and Roll No:");
        for (Student3 s : students) {
            System.out.println(s);
        }
    }
}
