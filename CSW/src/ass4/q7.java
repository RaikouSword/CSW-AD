package ass4;

public class q7 {
    private String studentName;
    private String courseName;

    public q7(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
        System.out.println("Student created: " + studentName + " enrolled in " + courseName);
    }

    public void updateCourse(String newCourseName) {
        this.courseName = newCourseName;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + studentName + " from " + courseName);
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory before student enrollment: " + beforeMemory / (1024 * 1024) + " MB");
        q7 student1 = new q7("Alice", "Computer Science");
        q7 student2 = new q7("Bob", "Mechanical Engineering");
        q7 student3 = new q7("Charlie", "Electrical Engineering");
        student1.updateCourse("Software Engineering");
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after student enrollment: " + afterMemory / (1024 * 1024) + " MB");
        student1 = null;
        student2 = null;
        student3 = null;
        System.gc();

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after garbage collection: " + finalMemory / (1024 * 1024) + " MB");

        System.out.println("Main method ends.");
    }
}

