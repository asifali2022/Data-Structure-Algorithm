package BitWiseOperatorInJava;

import java.util.Scanner;

public class TwoOddOccuringInArrayUsingBit {

	public static void main(String[] args) {
		
		System.out.println("Enter The Size Of Array::");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int [] a =new int[size];
		System.out.println("Enter The Array Element::");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		oddCounter(a,size);
		//oddCounter2(a,size);
		
	}
   
	static public void oddCounter(int a[],int b)
	{
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
				
			}
			if (count%2!=0) {
				System.out.println(a[i]);
				
			}
			
		}
		
	}
	// more efficient solution
	// a[5 6 10 6 10 6 3 3]
	//example
	//x=5 ^ 6 ^ 10 ^ 6 ^ 10 ^ 6 ^ 3 ^ 3
	//x=5 ^ 6 ^ 6 ^ 6 ^ 3 ^ 3 ^ 10 ^ 10 {x^x=0(even time )|x^x^x=x(odd time )} 
	//x=5 ^ 6 ^ 0 ^ 0
	//x= 3
	//binary represatation
	 
	// 5 ==> 00000000000000000000000000000101 
	// ^ ==> ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ {if both bit are diff then 1  And if both bit same then 0}
	// 6 ==> 00000000000000000000000000000110
    // 3 ==> 00000000000000000000000000000011
	// calculate k=(3 &(~(3-1)));
	// (3-1)  ==> 00000000000000000000000000000010
	// ~(3-1) ==> 11111111111111111111111111111101
	// (3 &(~(3-1)))      
	// 3      ==> 00000000000000000000000000000011
	// &      ==> &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	// ~(3-1) ==> 11111111111111111111111111111101
	//  k     ==> 00000000000000000000000000000001
	// k integer(decimal) value is also 1
	// a[5 6 10 6 10 6 3 3]
	// iteration :1   a[i]&k)!=0     ==> 5&1 =1 true  (if condition)   evalutes
	//      res1=0    res1=res1^a[i] ==> 0^5 =5 (XOR Property x^0=x)    |res1=5
	
	// iteration :2   a[i]&k)!=0     ==> 6&1 =0 fale  (else condition) evalutes
	//      res2=0    res1=res1^a[i] ==> 0^6 =1 (XOR Property x^0=x)    |res2=6
	
	// iteration :3   a[i]&k)!=0     ==> 10&1=0 false (else condition) evalutes
	//      res2=6    res2=res2^a[i] ==> 6^10 =12                       |res2=12
	
	// iteration :4   a[i]&k)!=0     ==> 6&1=0  false (else condition) evalutes
	//      res2=12    res2=res2^a[i] ==> 12^6 =10                      |res2=10
	
	// iteration :5   a[i]&k)!=0     ==> 10&1=0 false (else condition) evalutes
	//      res2=110    res2=res2^a[i] ==> 10^10 =0                     |res2=0
	
	// iteration :6   a[i]&k)!=0     ==> 6&1=0  false (else condition) evalutes
	//      res2=0    res2=res2^a[i] ==> 0^6 =6                         |res2=6
	
	// iteration :7   a[i]&k)!=0     ==> 3&1=1  true  (if condition)   evalutes
	//      res1=5    res1=res1^a[i] ==> 5^3 =6                         |res1=6
	
	// iteration :8   a[i]&k)!=0     ==> 3&1=1  true  (if condition)   evalutes
	//      res1=5    res1=res1^a[i] ==> 6^3 =6                         |res1=5
	// res2=6 and res1=5
	//time complexity ::theta(n)
	static public void oddCounter2(int a[],int b)
	{
		int x=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			x=x^a[i];
			
		}
		int k=(x &(~(x-1)));
		int res1=0;
		int res2=0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i]&k)!=0) 
			{
				res1=res1^a[i];
			}
			else 
			{
				res2=res2^a[i];
			}
		}
		System.out.println(res2+"&"+res1);
			
	}	

}
