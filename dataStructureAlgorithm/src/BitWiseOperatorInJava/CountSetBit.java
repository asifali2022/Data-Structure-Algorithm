package BitWiseOperatorInJava;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		
    System.out.println("Enter The Number::");
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int counter = setCounter(num);
    System.out.println(counter);
    int counter2 = setCounter2(num);
    System.out.println(counter2);

	}
	
//	 1st Iteration a=5 ===> 000000000000000000000000000101 ===> 5%2!=0([ans::1 satisfied||bit is set)
//	 count=1;
//	 a=a/2  ===>2
//	 2nd Iteration a=2 ===> 000000000000000000000000000010 ===> 2%2!=0([ans::0  NOT satisfied||bit is NOT set)
//    count=1;
//    a=a/2  ===>1
//	 3rd Iteration a=1 ===> 000000000000000000000000000001 ===> 1%2!=0([ans::1 satisfied||bit is set)
//	 count=2;
//	 a=a/2  ===>2
	 static public  int setCounter (int a)
	 {
		 int count =0;
		 while(a>0)
		 {
			 if(a%2!=0) // for checking last bit
			 { 
				 count++;
			 }
		  a=a/2; //for shifting bit to last position by floor division
		 }
		 
		 return count;
	 }
	 //Brian Kerringam's Algorithm
	 //transeverse only through set bits
	 //Time Complexity::theta(bits)
	 
	 
	 // 1st Interation:: a=40    ==> 101000
	 //                  a-1=39  ==> 100111   3 trailing 0's becomes 1 and  only last set bit becomes 0
	 //101000   ==>40
	 //&&&&&&
	 //100111   ==>39(a-1) making the last set bit 0
     //100000   ==>32
	 // 2nd Iteration:100000  ==>32
	 //               &&&&&&
	 //               000000  ==>0(a-1) making the last set bit 0
	 //               000000  ==> 
	 static public  int setCounter2 (int a)
	 {
		 int count =0;
		 while(a>0)
		 {
			a=a&(a-1); 
			count=count+1;
		 }
		 return count;
	 }
	 
}
