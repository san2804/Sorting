/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        
        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        bubbleSort(numbers);

        
        System.out.println("Array in Descending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    
}
