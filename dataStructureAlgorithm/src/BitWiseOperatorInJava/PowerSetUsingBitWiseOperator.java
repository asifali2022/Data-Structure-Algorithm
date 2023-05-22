package BitWiseOperatorInJava;

import java.util.Scanner;

public class PowerSetUsingBitWiseOperator {

	public static void main(String[] args) {
		System.out.println("Enter a String::");
	    Scanner sc=new Scanner(System.in);
	    String s = sc.next();
	    powerSet(s);

	}
//Time Complexity:: Theta ((2^n)*n)
//String s="abc"  n=s.length()=3
//2^n  ===> 2^3=8
//we consider binary representation from 0 to 7
// 0000000000000000000000000000
// -------------------------***
// -- ==> represents zeroe's    |  ***  ==> represent significant bit
// 29 zeroes and 3 significant Bit
//	 c b a                    c b a
// 0(0 0 0)  ==> ""         4(1 0 0)   ==> "c"
// 1(0 0 1)  ==> "a"        5(1 0 1)   ==> "ca"
// 2(0 1 0)  ==> "b"        6(1 1 0)   ==> "cb"
// 3(0 1 1)  ==> "ba"       7(1 1 1)   ==> "cba"
// Example:: String ="ab"
// n=2; powerset=4;
//            computing    (i&(1<<j))!=0 
// 1st Iteration ::i=0 j=0  0&(1<<0)!=0
//	                        0&1==> 0 condition not satified
//     Iteration ::i=0 j=1  0&(1<<1)!=0
//                          0&2==> 0 condition not satified
// 2nd Iteration ::i=1 j=0  1&(1<<0)!=0
//                          1&1==> 1 condition     satified  print a 
//     Iteration ::i=1 j=1  1&(1<<1)!=0
//                          1&2==> 0 condition not  satified 
// 3rd Iteration ::i=2 j=0  2&(1<<0)!=0
//                          2&1==> 0 condition not  satified
//     Iteration ::i=2 j=1  2&(1<<1)!=0
//                          2&2==> 2 condition   satified    print b
// 4th Iteration ::i=3 j=0  3&(1<<0)!=0
//                          3&1==> 1 condition   satified    print a
//     Iteration ::i=3 j=1  3&(1<<1)!=0
//                          3&2==> 2 condition   satified    print b
	
	
static public void powerSet(String s)
{ 
	int n=s.length();
	int powersetSize=(1<<n);   // 1<<3 ==> 1*(2^3) ==> 1*8 ==>8
	for (int i = 0; i < powersetSize; i++) 
	{
		for (int j = 0; j < n; j++) {
			
			if((i&(1<<j))!=0)
			{
				System.out.println(s.charAt(j));
			}
		}
		System.out.println();
	}
	
}


}
