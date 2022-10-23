import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int n : numbers) {
            if (n == 0) {
                zeroCount++;
            } else if (n % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        System.out.println("Number of odds: " + oddCount);
        System.out.println("Number of evens: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);
    }
}
