package recursion;

public class Log2BaseAlgo {

	public static void main(String[] args) {
		int fun = fun(16);
		System.out.println(fun);

	}
static public int fun(int n) {
	if (n==0) 
		return 0;
	return 1+fun(n/2);
}
}
