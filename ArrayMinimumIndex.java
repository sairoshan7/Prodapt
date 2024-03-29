package File;

import java.util.Scanner;

public class ArrayMinimumIndex {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of an array:");
    	int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<a;i++) {
        	arr[i] = sc.nextInt();
        }
        int min = findMin(arr, arr.length - 1);
        System.out.println("The smallest value in the array is: " + min);
        
        for(int k = 0; k< arr.length; k++) {
        	if(arr[k] == min) {
        		System.out.println("Smallest value index : "+k);
        	}
        }
    }
 
    public static int findMin(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return Math.min(array[index], findMin(array, index - 1));
        }
    }
}
 