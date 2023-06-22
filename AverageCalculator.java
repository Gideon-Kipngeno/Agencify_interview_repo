public class AverageCalculator {
public static double calculateAverage(int[] numbers) {
int total = 0;
for (int num : numbers) {
total += num;
}
double average = total / numbers.length;
return average;
}
public static void main(String[] args) {
int[] data = {5, 10, 15, 20, 25};
double result = calculateAverage(data);
System.out.println("The average is: " + result);
}
}

//the code does not have a bug 
/*  The code defines a class named AverageCalculator with a static method calculateAverage that takes an array of integers as input and returns the average.
    The method calculates the sum of all the numbers in the array and divides it by the number of elements to obtain the average.
    The code also includes a main method where an array of numbers is created and the calculateAverage method is called with this array.
    The average is then printed to the console.

the code calculates and displays the average of a given array of integers.*/