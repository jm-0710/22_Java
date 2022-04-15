
public class Op3 {

	public static void main(String[] args) {
		System.out.println(3.0/2);
		
		short a = 1, b = 3;
	    //short c = a+b; //기본 저장 단위가 int이기 때문에 에러발생
		int c1 = a+b;
		short c2 = (short)(a+b);
		System.out.println(c1);
		System.out.println(c2);
		// 계산시 항상 변수 type의 범위에 주의할 것
		
		char c3 = ' ';
		System.out.println(c3);
		
		// for 문 연습
		char c = 'a';
		for (; c < 'z'+1; c++) {
			System.out.print(c);
		}
		System.out.println();
		
		// Math.round()
		float pi = 3.14f;
		double shortpi = Math.round(pi);
		System.out.println(shortpi);
		

		 
	}

}
