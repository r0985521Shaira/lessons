package org.example.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            // Attempting to access an element from an array
            int[] numbers = {1, 2, 3};
            int result = getElementAtIndex(numbers, 5);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Catching and handling the exception
            System.out.println("Error: Array index is out of bounds.");
        }
    }

    // Method that attempts to get an element from an array
    private static int getElementAtIndex(int[] array, int index) {
        return array[index];
    }
}
