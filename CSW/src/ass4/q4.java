package ass4;

public class q4 {
    private String name;

    public q4(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + this.name);
    }

    public static void main(String[] args) {
        new q4("Anonymous Object");
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method ends.");
    }
}

