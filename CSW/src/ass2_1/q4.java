package ass2_1;

public class q4 {
    public static void main(String[] args) {
        Student1[] students = new Student1[3];
        students[0] = new Student1("Alice", 101, 95);
        students[1] = new Student1("Bob", 102, 89);
        students[2] = new Student1("Charlie", 103, 92);

        String searchName = "Bob";
        int index = linearSearch(students, searchName);

        if (index != -1) {
            System.out.println("Student found: " + students[index]);
        } else {
            System.out.println("Student not found.");
        }

        if (students[0].compareTo(students[1]) > 0) {
            System.out.println("Student " + students[0].getName() + " has higher marks than " + students[1].getName());
        } else {
            System.out.println("Student " + students[1].getName() + " has higher or equal marks than " + students[0].getName());
        }
    }

    public static int linearSearch(Student1[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;  
    }
}

class Student1 implements Comparable<Student1> {
    private String name;
    private int rollNumber;
    private int totalMark;

    public Student1(String name, int rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", totalMark=" + totalMark +
                '}';
    }

    @Override
    public int compareTo(Student1 other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }
}
