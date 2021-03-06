package com.selectionsort;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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
			
			int sortedArray[] = selectionSort(array);
		
			System.out.println("Original Array order ");
			System.out.println(Arrays.toString(sortedArray));
			
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception : "+e.getMessage());
		}
		
		
	}

	private static int[] selectionSort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length-1; i++) {
			int smallestIndex =i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int smallestElement = array[smallestIndex];
			array[smallestIndex] =array[i];
			array[i] = smallestElement;
			
		}
		return array;
	}

}
