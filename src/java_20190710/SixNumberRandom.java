package java_20190710;

import java.util.Random;

//로또 랜덤 넘버 뽑기

//int nextInt() ->  가능한 모든 int 값(양수와 음수)에 걸친 범위의 숫자
//int nextInt(int num) -> 0 부터 num-1까지 범위에 있는 숫자

public class SixNumberRandom {
	public static void main(String args[]) {
		int a[] = new int[6];
		Random r = new Random();
		for (int i = 0; i <= 5; i++) {
			a[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
		}

		for (int k = 0; k <= 5; k++) {
			if(k==5) {
				System.out.print(a[k]);
			}else {
				System.out.print(a[k]+",");
				
			}
		}
	}
}
