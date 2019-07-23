package test;

import java.util.Arrays;

public class Calulator2 {

	/*
	 * public static void main(String args[]) { int[] array = { 1, 2, 3, 1, 2, 3, 4,
	 * 6, 3, 7, 4 }; int[] result = new int[array.length];
	 * 
	 * for (int i = 0; i < array.length; i++) {
	 * 
	 * int val = array[i]; int endIdx = 0;
	 * 
	 * for (int j = 0; j < result.length; j++) { if (result[j] != val) { endIdx++; }
	 * }
	 * 
	 * if (endIdx == result.length) { result[array.length + i] = val; } }
	 * System.out.println("result : " + Arrays.toString(result)); }
	 */

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 3, 4, 6, 3, 7, 4 };// unsorted array
		Arrays.sort(arr);// sorting array
		int length = arr.length;
		length = removeDuplicateElements(arr, length);

		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}
