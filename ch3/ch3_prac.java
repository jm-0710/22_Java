
public class ch3_prac {
	
	public static void main(String[] args) {
		
		// 3-2
		System.out.println();
		System.out.println("3-2");
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket) + 1;
		
		System.out.println("필요한 바구니 수:" + numOfBucket);
		
		// 3-3
		System.out.println();
		System.out.println("3-3");
		int num = 10;
		System.out.println(num > 0 ? "양수": num == 0? '0' : "음수");
		
		// 3-4
		System.out.println();
		System.out.println("3-4");
		int num4 = 456;		
		System.out.println((int)((double)num4/100)*100);
		
		// 3-6
		System.out.println();
		System.out.println("3-6");
		int num6 = 24;
		System.out.println(10*(num6/10 + 1) - num6);
		
		// 3-7
		System.out.println();
		System.out.println("3-7");
		int fa = 100;
		float cel = (5/9f * (fa - 32));
		System.out.println((int)(cel * 100 + 0.5)/100.0);
		
		// 3-8
		System.out.println();
		System.out.println("3-8");
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000L * 3000L * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float) d == f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

		// 3-9
		System.out.println();
		System.out.println("3-9");
		char ch9 = 'z';
		boolean b9 = ('A' <= ch9 && ch9 <= 'Z') || ('a' <= ch9 && ch9 <= 'z') || ('0'<= ch9 && ch9 <= '9') ;
		System.out.println(b9);
		
		// 3-10
		char ch10 = 'A';
		char lowerCase = ('A' <= ch10 && ch10 <= 'Z') ? (char)(ch10 - 'A' + 'a') : ch;
		System.out.println("ch:"+ch10);
		System.out.println("ch to lowerCase:"+lowerCase);


	}
	


}
