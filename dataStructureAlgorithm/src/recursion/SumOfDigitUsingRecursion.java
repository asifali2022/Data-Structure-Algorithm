package recursion;

import java.util.Scanner;

public class SumOfDigitUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter The Number::");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int sumN1 = sumN(j);
			System.out.println(sumN1);	
	}
static public int sumN(int a)
{
	if(a<10) {
		return a;
	}
	return sumN(a/10)+a%10;
}
}
