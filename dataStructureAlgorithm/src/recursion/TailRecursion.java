package recursion;

public class TailRecursion {

	public static void main(String[] args) {
		
      fun(5,1);
	}
	
	static public void fun(int n, int k)
	{
		if(n==0)
			return;
		System.out.println(k);
		fun(n-1,k+1);
	}
}