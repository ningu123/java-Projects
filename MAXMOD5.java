class MAXMOD5
{
	public static int last(int a,int b) 
	
	{
		if(a> b)
			return a;
		if (a%5 == b%5 && b>a)

			return a;
		else 
			return b;
	}
	public static void main(String[] args) {
		System.out.println(last(2,3));
		System.out.println(last(6,2));
		System.out.println(last(3,2));
	}
}
	
