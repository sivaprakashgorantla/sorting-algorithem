package com.BinarySort;

import java.util.Arrays;

public class BinaryClient {
	public static void main(String[] args) {
		int[] array =  {100,10,20,30,120,11,105,120};
		
		System.out.println("Array Elements : "+Arrays.toString(array));
		
		BinarySearchTree binarySearchTree = new BinarySearchTree(array[0]);
		
		for (int data :array) {
			binarySearchTree.insert(binarySearchTree.node, data);
		}
		
		System.out.println("After Sorting ");
		
		binarySearchTree.inOrder(binarySearchTree.node);
	}
}
