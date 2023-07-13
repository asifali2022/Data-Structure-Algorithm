package recursion;

public class TailRecursion2 {

	public static void main(String[] args) {
		
      int i = fun7(5,1);
      System.out.println(i);
	}
	
	static public int fun7(int n,int k)
	{
		if(n==0||n==1)
			return k;
		return fun7(n-1,k*n);
}
}


