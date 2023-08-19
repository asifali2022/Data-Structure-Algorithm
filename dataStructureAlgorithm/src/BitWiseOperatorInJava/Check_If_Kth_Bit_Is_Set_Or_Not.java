package BitWiseOperatorInJava;


import java.util.*;

public class Check_If_Kth_Bit_Is_Set_Or_Not {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number::");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter The Kth Index");
		int knum = sc.nextInt();
		sc.close();
//		set(num,knum);
//		set2(num,knum);
//		set3(num,knum);
		set4(num,knum);
}
	
	
	
//Time Complexity::theta(k)
//1st::naive solution
//n=5;k=3;
// doing Bitwise AND with a NUMBER whose only kth bit ist set
// NUMBER whose only kth bit ist set==formula 2^(k-1)
//2^(k-1) ===> 2^(3-1) ====> 2^2 ===> 4
// 4's only set index 3rd  and we need to compare it with 5's 3rd index
//(101 )& (100)
//	1  &  1   = 1
//	0  &  0   = 0
//	1  &  0   = 0
	// 101 ~~4
// =       =
//  5   &   4	
	
static public void  set(int a,int b)
{
	int x=1;
	for(int j=0;j<b-1;j++)
	{
		x=x*2;
	}
	if((a&x)!=0)
	{
		System.out.println("Bit Is Set");
	}
	else
	{
		System.out.println("Bit Is Not Set");
	}
	
}
//Time Complexity::theta(k)
//2st::naive solution
//we reduce n to n/[2^(k-1)]
//n=5 ,k=3 ==> n/2 ==>5/2 ==> 2/2===>
// 1 has only one bit that is 1
//n&1
static public void set2(int n,int k)
{
	for(int j=0;j<k-1;j++)
	{
		n=n/2;     //we reduce n to n/[2^(k-1)]
	}
	if((n&1)!=0)
	{
		System.out.println("Bit Is Set");
	}
	else
	{
		System.out.println("Bit Is Not Set");
	}
}
//Time Complexity::
//3rd::Efficient solution
// to compute 2^(k-1)
static public void set3(int n,int k)
{
	int x=1<<(k-1);  // to compute 1*(2^(k-1))
	if((n&x)!=0)
	{
		System.out.println("Bit Is Set");
	}
	else
	{
		System.out.println("Bit Is Not Set");
	}
}

//Time Complexity::
//3rd::Efficient solution
//to compute n/[2^(k-1)]
static public void set4(int n,int k)
{
	int x=n>>(k-1);  //to compute n/[2^(k-1)]
	if((x&1)!=0)
	{
		System.out.println("Bit Is Set");
	}
	else
	{
		System.out.println("Bit Is Not Set");
	}
}
}