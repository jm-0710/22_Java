
public class Op2 {

	public static void main(String[] args) {
		// 삼항연산자 연습
		double x = 7.1;
		int y = (x > 0) ? 1: 0;
		float pi = 3.14f; // f 접미사
		long L = 923846L; // L 접미사
		
		System.out.println(y);
		
		// 산술변환
		double result = x + (double) y; // 사실 안 해도 같은 결과
		System.out.println(result);
		
		// int 간 연산의 결과는 int
		int a = 10, b = 4;
		System.out.println(a/b); // 자동으로 몫의 연산
		System.out.println((double)a/b);
		System.out.println(a/(double)b); // 두 피연산자 중 하나를 형변환해줘야함
		

	}

}
