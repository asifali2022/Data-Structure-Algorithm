package recursion;

public class PrintNto1usingRecursion {

	public static void main(String[] args) {
		fun(3);

	}
static public void fun(int n)
{ 
	if(n==0)
		return;
	System.out.println(n);
	fun(n-1);
	
}
}
