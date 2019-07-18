package test;

import java.util.Random;
import java.util.Scanner;

public class LetterGame {
	public static void main(String[] args) {
		Random random = new Random(); //랜덤한 수 발생하는 객체 생성
		int answer = random.nextInt(100); //100까지의 수만 랜덤하게 사용하기 위함
		//System.out.print(answer); 정답이 나오는지 확인하기 위해서 사용하였다가 확인 후 주석처리하였음
		
		int input;
		int repeat = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자중 하나를 고르시오");
		do {
			System.out.print("정답을 추측하시오: ");
			input = sc.nextInt();
			repeat++;

			if (input > answer) {
				System.out.println("좀 더 낮을수를 입력하시오");
			} else if (input < answer) {
				System.out.println("좀 더 높은수를 입력하시오");
			}
		} while (input != answer);
		System.out.printf("짝짝짝 정답입니다. 총 시도횟수는 " + repeat + "번 입니다.");
	}
}
