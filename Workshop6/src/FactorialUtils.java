public class FactorialUtils {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Non-negative integer required");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}



