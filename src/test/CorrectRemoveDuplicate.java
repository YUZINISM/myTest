package test;

public class CorrectRemoveDuplicate {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3 };
		int[] arr2 = { 2, 3, 4, 5, 7, 8, 9 };

		int[] arr3 = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			int val = arr2[i];
			int endIdx = 0;

			for (int j = 0; j < arr3.length; j++) {
				if (arr3[j] != val) {
					endIdx++;
				}
			}
			if (endIdx == arr3.length) {
				arr3[arr.length + i] = val;
			}
		}
	}
}
