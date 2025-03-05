package ass2_2;

import java.util.*;

class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", mark=" + mark + '}';
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student("Alice", 20, 85));
        studentList.add(new Student("Bob", 21, 90));
        studentList.add(new Student("Charlie", 22, 75));

        System.out.println("List of Students:");
        displayStudents(studentList);

        System.out.println("\nEnter the name of the student to search:");
        String nameToSearch = scanner.nextLine();
        Student studentToSearch = new Student(nameToSearch, 0, 0);

        if (studentList.contains(studentToSearch)) {
            System.out.println(nameToSearch + " exists in the list (based on value comparison).");
        } else {
            System.out.println(nameToSearch + " does not exist in the list.");
        }

        System.out.println("\nEnter the name of the student to remove:");
        String nameToRemove = scanner.nextLine();
        Student studentToRemove = new Student(nameToRemove, 0, 0); 

        if (studentList.remove(studentToRemove)) {
            System.out.println(nameToRemove + " has been removed from the list.");
        } else {
            System.out.println(nameToRemove + " was not found in the list.");
        }

        System.out.println("\nNumber of students left in the list: " + studentList.size());

        System.out.println("\nUpdated list of students:");
        displayStudents(studentList);
    }

    public static void displayStudents(LinkedList<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}
