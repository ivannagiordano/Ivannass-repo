package COP2805;

public class DynamicFibonacci extends Thread {
    private int n;
    private long result;
    private long duration;

    public DynamicFibonacci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        
        long startTime = System.currentTimeMillis();
       
        result = fibonacciDynamic(n);
        
        long endTime = System.currentTimeMillis();
        
        duration = endTime - startTime;
        
        System.out.println("Dynamic Fibonacci(" + n + ") = " + result + " | Execution Time: " + duration + " ms");
    }

    private int fibonacciDynamic(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int v1 = 0, v2 = 1, v3 = 0;
        for (int i = 2; i <= n; i++) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        return v3;
    }

    public long getDuration() {
        return duration;
    }

    public long getResult() {
        return result;
    }
}
