package Task; 

import java.util.Scanner;

public class sorting {
    private int[] a;
    public sorting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        a = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close(); 
    }
    public void sortArray() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                  
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public void displaySortedArray() {
        System.out.println("Sorted Array:");
        for (int num : a) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        sorting s = new sorting(); 
        s.sortArray(); 
        s.displaySortedArray(); 

    }
}

