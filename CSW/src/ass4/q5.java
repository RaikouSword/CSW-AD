package ass4;

public class q5 {
    private int intValue;
    private double doubleValue;

    public q5(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void updateValues(int newIntValue, double newDoubleValue) {
        this.intValue = newIntValue;
        this.doubleValue = newDoubleValue;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: DataMemberExample object");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory before creating objects: " + beforeMemory + " bytes");

        q5 obj1 = new q5(10, 20.5);
        q5 obj2 = new q5(30, 40.75);

        obj1.updateValues(50, 60.25);
        obj2.updateValues(70, 80.5);
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after creating and updating objects: " + afterMemory + " bytes");
        obj1 = null;
        obj2 = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after garbage collection: " + finalMemory + " bytes");
    }
}

