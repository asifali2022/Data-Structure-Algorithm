package BitWiseOperatorInJava;

import java.util.*;

public class OneOddOccuringInArrayUsingBit {

	public static void main(String[] args) {
		System.out.println("Enter The Size Of Array::");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int [] a =new int[size];
		System.out.println("Enter The Array Element::");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int counter = oddCounter(a,size);
		System.out.println(counter);
		int counter1 = oddCounter2(a,size);
		System.out.println(counter1);
		
		

	}
	static public int oddCounter(int a[],int b)
	{
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
				
			}
			if (count%2!=0) {
				return a[i];
				
			}
			
		}
		
		return 0;
	}
	// using properties of xor(^) operator
	// xor operator is commutative and associative
	// x^0=x   x^x=0
	// x^x^x.....(odd times) |   x^x^x^x....(even time)
	// x^x=0 and 0^x=x       |   x^x=0 and x^x=0 and 0^0=0
	// oddtimes==> x         |   eventimes==>0
	// example a[4 4 7 4 8 7 7 7 8]
	// count=a[0]^a[i];
	// (4^4^4)^(7^7^7^7)^(8^8)
	//   4^0^0
	//   4
	
	
	static public int oddCounter2(int a[],int b)
	{
		int count=a[0];
		for (int i = 1; i < a.length; i++) {
			count=count^a[i];
			
		}
		return count;
	}

}
