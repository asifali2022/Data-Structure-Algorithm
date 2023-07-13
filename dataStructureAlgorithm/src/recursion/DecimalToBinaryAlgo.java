package recursion;

public class DecimalToBinaryAlgo {

	public static void main(String[] args) {
		fun(13);

	}
static public void fun(int n)
{
	if(n==0)
		return ;
	fun(n/2);
	System.out.print(n%2);
}
}
