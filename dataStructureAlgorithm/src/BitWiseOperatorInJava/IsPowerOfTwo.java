package BitWiseOperatorInJava;

import java.util.Scanner;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter The No::");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		boolean checkPower = checkPowerOfTwo(n);
		System.out.println(checkPower);
		boolean checkPower2 = checkPowerOfTwo2(n);
		System.out.println(checkPower2);
	}
	
//Naive Solution
// Time Complexity:O(logn)
 static public boolean checkPowerOfTwo(int a)
 {
	 
if ( a==0) {
	 return true;
} 
	 while (a!=1 )
	 {
		 if((a%2)!=0)
		 {   
			 return false;
		 }
		 a=a/2;
	 }
		 
		return true;
	 
 }
 
 //Efficient Solution
 //using Brian Kullingam Algorithm
 //Binary Representation of power of 2 have only one set Bit
 // Brian Algorithm UNSET'S last Set Bit making it zero 
 // n&(n-1)==0
 //n=4    :00000000000000000000000000000100
 //&      :&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
 //n-1=3  :00000000000000000000000000000011(unsetting last set bit)
 //n&(n-1):00000000000000000000000000000000    n&(n-1)==0 condition satisfied
 
//n=6    :00000000000000000000000000000110
//&      :&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//n-1=5  :00000000000000000000000000000101(unsetting last set bit)
//n&(n-1):00000000000000000000000000000100     n&(n-1)==0  not condition satisfied
  
 static public  boolean   checkPowerOfTwo2(int a)
 {
	if(a==0)
		return true;
	return ((a&(a-1))==0);
	 
 }
}
