package ass4;

public class q6 {

    public static void main(String[] args) {
        final int NUM_OBJECTS = 1000000;
        long startTime = System.currentTimeMillis();
        printMemoryDetails("Initial");
        q6[] objects = new q6[NUM_OBJECTS];
        for (int i = 0; i < NUM_OBJECTS; i++) {
            objects[i] = new q6();
        }
        printMemoryDetails("After object creation");
        objects = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printMemoryDetails("After garbage collection");

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for execution: " + (endTime - startTime) + " ms");
    }

    private static void printMemoryDetails(String phase) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("[" + phase + "] Timestamp: " + System.currentTimeMillis() +
                ", Total Memory: " + totalMemory / (1024 * 1024) + " MB, " +
                "Free Memory: " + freeMemory / (1024 * 1024) + " MB, " +
                "Used Memory: " + usedMemory / (1024 * 1024) + " MB");
    }
}
