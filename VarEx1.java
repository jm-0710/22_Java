class VarEx1
{
	public static void main(String[] args) 
	{
		int a = 10, b = 20;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

	}
}
