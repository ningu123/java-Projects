class NOTEENSUM
{
	public static int ten(int a, int b, int c)
	 {
		int sum= fixTeen(a)+fixTeen(b)+fixTeen(c);
		return sum;
	  }
	  public static int fixTeen(int num)
	  {
	  	if(num==13 || num==14 || num==17 || num==18 || num ==19)
	  		return 0;
	  	else 
	  		return num;
	  }
	  public static void main(String[] args) {
	  	System.out.println(ten(1,2,3));
	  	System.out.println(ten(1,2,13));
	  	System.out.println(ten(1,2,14));
	  }
}