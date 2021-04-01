class inorder
{
	public static boolean order(int a,int b,int c,boolean equalOk) 
	{ 
		if(a<b && b<c)
			return true;
		if(equalOk== true || a==b)
			 return true;
	    else 
				return false;
	}
	public static void main(String[] args) {
		System.out.println(order(2,5,11,false));
		System.out.println(order(5,7,6,false));
		System.out.println(order(5,5,7,true));
	}
}