import java.util.*;

public class NumberUtils {
    public int[] getEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                     .filter(n -> n % 2 == 0)
                     .toArray();
    }
}


