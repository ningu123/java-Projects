class blueticket
{
	public static int blue(int a,int b,int c) 
	{
		int ab= a+b ; int bc=b+c; int ac=c+a;
		if(ab==10 || bc==10 || ac==10 )
			return 10;
		if(ab>=10+bc || ab>=10+ac)
			return 5;
		else
			return 0;
	}
	public static void main(String[] args) {
		System.out.println(blue(9,1,0));
		System.out.println(blue(9,2,0));
		System.out.println(blue(6,1,4));
	}
}