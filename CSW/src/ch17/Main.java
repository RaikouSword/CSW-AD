package ch17;

public class Main {

    public static void main(String[] args) {
        Runnable run1 = new Runnable() {
            public void run() {
                System.out.println("Thread running");
            }
        };
        Thread t1 = new Thread(run1);
        t1.start();

        Runnable run2 = () -> {
            System.out.println("Thread running");
        };
        Thread t2 = new Thread(run2);
        t2.start();

        Runnable run3 = () -> {
            System.out.print("The id of the third thread is ");
            System.out.println(Thread.currentThread().getId());
        };
        Thread t3 = new Thread(run3);
        t3.start();

        Runnable run4 = () -> {
            System.out.print("The class of the fourth thread is ");
            System.out.println(Thread.currentThread().getClass());
        };
        Thread t4 = new Thread(run4);
        t4.start();
    }
}
