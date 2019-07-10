package java_20190710;

public class MyClass2 {
	public static void main(String args[]) {
		for (int i = 1; i < 11; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("짝, ");
			} else if (i < 11) {
				System.out.print(i + ", ");
			}
		}

		for (int e = 11; e < 21; e++) {
			if (e == 13 || e == 16 || e == 19) {
				System.out.print("짝, ");
			} else if (e < 21) {
				System.out.print(e + ", ");
			}
		}

		for (int q = 21; q < 30; q++) {
			if (q == 23 || q == 26 || q == 29) {
				System.out.print("짝, ");
			} else if (q < 30) {
				System.out.print(q + ", ");
			}
		}

		for (int w = 30; w < 40; w++) {
			System.out.print("짝, ");
		}

		for (int r = 40; r < 52; r++) {
			if (r == 43 || r == 46 || r == 49) {
				System.out.print("짝, ");
			} else if (r < 52) {
				System.out.print(r + ", ");
			}
		}

		for (int t = 52; t < 60; t++) {
			if (t == 53 || t == 56 || t == 59) {
				System.out.print("짝, ");
			} else if (t < 60) {
				System.out.print(t + ", ");
			}
		}

		for (int y = 60; y < 72; y++) {
			System.out.print("짝, ");
		}
		
		for (int a = 73; a < 82; a++) {
			if (a == 73 || a == 76 || a == 79) {
				System.out.print("짝, ");
			} else if (a < 82) {
				System.out.print(a + ", ");
			}
		}
		
		for (int s = 82; s < 90; s++) {
			if (s == 83 || s == 86 || s == 89) {
				System.out.print("짝, ");
			} else if (s < 92) {
				System.out.print(s + ", ");
			}
		}
		
		for (int s = 90; s < 101; s++) {
			if (s < 100) {
				System.out.print("짝, ");
			} else if (s == 100) {
				System.out.print(s);
			}
		}
	}
}
