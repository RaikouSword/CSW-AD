package ass2_1;

public class q5 {
    public static void main(String[] args) {
        Student2[] students = new Student2[5];
        students[0] = new Student2("Alice", 101, 95);
        students[1] = new Student2("Bob", 102, 89);
        students[2] = new Student2("Charlie", 103, 92);
        students[3] = new Student2("David", 104, 88);
        students[4] = new Student2("Eva", 100, 85);

        System.out.println("Before Sorting:");
        for (Student2 student : students) {
            System.out.println(student);
        }

        bubbleSort(students);

        System.out.println("\nAfter Sorting by Roll Number:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private int rollNumber;
    private int totalMark;

    public Student2(String name, int rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public String toString() {
        return "Student2{name='" + name + "', rollNumber=" + rollNumber + ", totalMark=" + totalMark + '}';
    }

    @Override
    public int compareTo(Student2 other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }
}
