package recursion;

public class Print1toNusingRecursion2 {

	public static void main(String[] args) {
		fun(5);
	}
static public void fun(int n)
{
	if(n==0) {
		return;
	}
	fun(n-1);
	System.out.println(n);
}
}
