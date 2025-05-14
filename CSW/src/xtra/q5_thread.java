class Q5Thread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup myThreadGroup = new ThreadGroup("ThreadGroup");

        Q5Thread t1 = new Q5Thread();
        Thread thread1 = new Thread(myThreadGroup, t1);
        thread1.start();

        Q5Thread t2 = new Q5Thread();
        Thread thread2 = new Thread(myThreadGroup, t2);
        thread2.start();
    }
}
