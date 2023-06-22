# Agencify_interview_repo
#employee_query.sql 
    SELECT id, name, age, salary: This part of the query specifies the columns to be selected from the table. In this case, the columns selected are id, name, age, and salary.

    FROM employees: This part of the query specifies the table from which the data will be retrieved. In this case, the table is named employees.

    WHERE age > 30 AND salary > 50000.00: This part of the query sets conditions to filter the data. Only the rows that satisfy the given conditions will be included in the result. In this case, the conditions are:
        age > 30: Only employees with an age greater than 30 will be included.
        salary > 50000.00: Only employees with a salary greater than 50000.00 will be included.

So, when this query is executed, it will retrieve the id, name, age, and salary columns from the employees table, but only for those employees who are older than 30 and have a salary greater than 50000.00. The result will be a subset of rows that meet these conditions.
#FibonacciSequence.java
    The code defines a class named FibonacciSequence and imports necessary classes (HashMap, Map, and Scanner) from the Java standard library.
    It uses a Scanner object to read a positive integer input from the user.
    The program validates the input, displays an error message if it's not a positive integer, and exits.
    The program generates the Fibonacci sequence up to the input number using a recursive method (fibonacci) and a cache (fibCache) to avoid redundant calculations.
    The calculated Fibonacci numbers are printed to the console.

#LargestDiff.java
    The code defines a class named LargestDiff and imports necessary classes (ArrayList, HashSet, List, Scanner, and Set) from the Java standard library.
    It uses a Scanner object to read the number of elements in the list from the user.
    The program validates the input, displays an error message if it's not a positive number, and exits.
    The program prompts the user to enter the elements of the list and stores them in an ArrayList.
    It checks if the list contains duplicate numbers using a HashSet.
    The program finds the largest difference between any two numbers in the list using an efficient algorithm.
    The largest difference is printed to the console.

    #averagecalculator.java
     The code defines a class named AverageCalculator with a static method calculateAverage that takes an array of integers as input and returns the average.
    The method calculates the sum of all the numbers in the array and divides it by the number of elements to obtain the average.
    The code also includes a main method where an array of numbers is created and the calculateAverage method is called with this array.
    The average is then printed to the console. The code calculates and displays the average of a given array of integers.
