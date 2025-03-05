package ass2_1;

class Student<T> {
    String name;
    T rollNumber;
    int age;

    Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student<?> student = (Student<?>) obj;
        return rollNumber.equals(student.rollNumber);
    }
}

public class q1 {
    public static void main(String[] args) {
        Student<Integer> student1 = new Student<>("Alice", 12345, 20);
        Student<String> student2 = new Student<>("Bob", "A123", 22);

        System.out.println("Student 1 Details: " + student1);
        System.out.println("Student 2 Details: " + student2);

        if (student1.equals(student2)) {
            System.out.println("Both students have the same roll number.");
        } else {
            System.out.println("Students have different roll numbers.");
        }
    }
}
