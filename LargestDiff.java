import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LargestDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive number for the number of elements.");
            return;
        }

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (hasDuplicates(numbers)) {
            System.out.println("Error: The list cannot have duplicate numbers.");
            return;
        }

        int largestDifference = findLargestDifference(numbers);
        System.out.println("Largest Difference: " + largestDifference);
    }

    private static boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                return true;
            }
        }
        return false;
    }

    private static int findLargestDifference(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return 0;
        }

        int min = numbers.get(0);
        int maxDiff = numbers.get(1) - min;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int diff = currentNum - min;

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (currentNum < min) {
                min = currentNum;
            }
        }

        return maxDiff;
    }
}
