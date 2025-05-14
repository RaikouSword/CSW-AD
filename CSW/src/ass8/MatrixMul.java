package ass8;

public class MatrixMul {

    static final int N = 3;

    static int[][] A = {
        {2, 4, 1},
        {3, 1, 5},
        {7, 6, 2}
    };

    static int[][] B = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    static int[][] C = new int[N][N];

    static class RowTask extends Thread {
        int r;

        RowTask(int r) {
            this.r = r;
        }

        public void run() {
            for (int c = 0; c < N; c++) {
                C[r][c] = 0;
                for (int k = 0; k < N; k++) {
                    C[r][c] += A[r][k] * B[k][c];
                }
            }
            System.out.println("Row " + r + " done.");
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {
            threads[i] = new RowTask(i);
            threads[i].start();
        }

        try {
            for (int i = 0; i < N; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

