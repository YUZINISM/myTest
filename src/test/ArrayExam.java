package test;

import java.util.Arrays;

public class ArrayExam {
	public static void main(String args[]) {
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		int a5 = 5;

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;

		String[] strArr = { "mo", "tu", "we", "th", "fr", "sa", "su" };

		for (int i = 0; i < 7; i++) {

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
