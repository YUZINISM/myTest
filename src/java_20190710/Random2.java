package java_20190710;

import java.util.Random;

public class Random2 {
	public static void main(String args[]) {
		int a;
		Random r = new Random();
		a = r.nextInt(10)+1;
		
		System.out.println(a);
	}
}
