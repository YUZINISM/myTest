package java_20190710;

import java.util.Arrays;

public class NewClass {
	public static void main(String args[]) {

		int[] evenGroup = new int[4];
		int[] oddGroup = new int[5];

		int evenNumber = 0;
		int oddNumber = 0;

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				evenGroup[evenNumber] = i;
				evenNumber++;
			} else {
				oddGroup[oddNumber] = i;
				oddNumber++;
			}
		
			System.out.print(Arrays.toString(evenGroup));
			System.out.print(Arrays.toString(oddGroup));
		}
	}
}
