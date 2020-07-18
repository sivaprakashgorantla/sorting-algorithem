package com.bubblesort;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
			// TODO Auto-generated method stub
			System.out.println("Enter the Array List");
			scanner = new Scanner(System.in);
			
			int arraySize = scanner.nextInt();
			
			int array[] = new int [arraySize];
			System.out.println("Enter the "+arraySize+" Elements : ");
			for (int i = 0; i < arraySize; i++) {
				array[i] = scanner.nextInt();
			}
			
			System.out.println("Original Array order ");
			System.out.println(Arrays.toString(array));
			
			int sortedArray[] = bubbleSort(array);
		
			System.out.println("Original Array order ");
			System.out.println(Arrays.toString(sortedArray));
			
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception : "+e.getMessage());
		}
		
		
	}

	private static int[] bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		
		boolean sorted = false;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					sorted = true;
				}
			}
			if(!sorted) {
				break;
			}
		}
		return array;
	}

}
