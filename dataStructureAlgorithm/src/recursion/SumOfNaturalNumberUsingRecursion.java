package recursion;

public class SumOfNaturalNumberUsingRecursion {

	public static void main(String[] args) {
		int sum1 = sum(5);
		System.out.println(sum1);

	}
	static public int sum(int a)
	{
		if (a==1) {
			return 1;
		}
		return  sum(a-1)+a;
	}
}
