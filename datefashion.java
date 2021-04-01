class datefashion
{
	public static int date(int you, int date) 
	{
		if(you>=8 || date>=8)
			return 2;
		if (you<=2 || date<=2)
			return 0;
		else 
			return 1;
	}
	public static void main(String[] args) {
		System.out.println(date(5,10));
		System.out.println(date(5,2));
		System.out.println(date(5,5));
	}
}