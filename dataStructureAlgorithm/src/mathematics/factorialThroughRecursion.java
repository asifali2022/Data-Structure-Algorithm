package mathematics;

public class factorialThroughRecursion {

	 int fact(int n)
	{
		if (n<=0)
			{
			return 1;
			}
	 return n*(fact(n-1));
	}
	
	
	public static void main(String[] args) {
		
		factorialThroughRecursion b= new factorialThroughRecursion();
	    int n=b.fact(1);
	    System.out.println(n);

	}

}
