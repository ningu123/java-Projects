class old35
{
	public static boolean last(int a) 
	{
      if(a%3 ==0 && a%5==0)
      	return false;
      return true;
	}
	public static void main(String[] args) {
		System.out.println(last(3));
		System.out.println(last(10));
		System.out.println(last(15));
	}
}