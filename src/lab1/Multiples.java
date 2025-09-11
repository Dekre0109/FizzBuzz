package lab1;

public class Multiples {
    public static void main(String[] args) {
        // Call the multiples method with default values
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    // Extracted method that does the calculation
    public static int multiples(int n, int a, int b) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        return count;
    }
}
