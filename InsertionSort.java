/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author DELL
 */
public class InsertionSort {

    // Method to perform insertion sort in ascending order
    public void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method to perform insertion sort in descending order
    public void InsertionSortOP(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are smaller than key to one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

 class InsertionSortTest {

    public static void main(String[] args) {
        // Create an instance of the InsertionSort class
        InsertionSort sorter = new InsertionSort();

        // Example array for testing
        int[] arrAscending = {5, 3, 2, 1};
        int[] arrDescending = {5, 3, 2, 1};

        // Call the InsertionSort method for ascending order
        sorter.InsertionSort(arrAscending);
        System.out.println("Array sorted in ascending order:");
        printArray(arrAscending);

        // Call the InsertionSortOP method for descending order
        sorter.InsertionSortOP(arrDescending);
        System.out.println("Array sorted in descending order:");
        printArray(arrDescending);
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
