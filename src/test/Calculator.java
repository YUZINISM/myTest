package test;

import java.util.Arrays;

public class Calculator {
	public static void main(String args[]) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 32, 24, 45, 2, 1, 52, 9, 5 };
		int length = array1.length + array2.length;
		int[] array3 = new int[length];

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		
		for (int j = 5; j < array3.length + 5; j++) {
			array3[j] = array2[j];
		}
		
		System.out.println("array1 : " + Arrays.toString(array1));
		System.out.println("array2 : " + Arrays.toString(array2));
		System.out.println("array3 : " + Arrays.toString(array3));

	}
}
