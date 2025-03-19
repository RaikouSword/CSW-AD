package ass4;

public class q2 {
    private String name;

    public q2(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + this.name);
    }

    public static void main(String[] args) {
        q2 obj1 = new q2("First Object");
        q2 obj2 = new q2("Second Object");
        obj1 = obj2;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method ends.");
    }
}

