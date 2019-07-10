package java_20190710;

public class MyClass {
	
	//정의
	public static void numbering() {
		int i = 0;
		while ( i < 10 ) {
			System.out.println(i);
			i++;
		}
	}
	
	//호출
	public static void main(String[] args) {
		numbering(); 
		/*numbering(); 
		numbering(); 
		numbering();*/ 
		//반복 출력 가능
	}
}

