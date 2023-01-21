package BitWiseOperatorInJava;

import java.util.Scanner;

class IntegerToBinary1{
	
	static public  void Binary(int a)
	{
		
		 final int dub=a;
		 int [] q=new int[32];
		 int i=0;
		 int count=0;
		 while(a!=0)
		 {
			q[i++]=a%2;
	        count++;
			a=a/2;
		 }
		 
		 System.out.println("32 bit format::");
		 for(int j=q.length-1;j>=0;j--)
		 {
			 System.out.print(q[j]);
		 }
		 System.out.println();
		 
		 for(int j=count-1;j>=0;j--)
		 {
			 System.out.print(q[j]);
		 }
		
	}
}

public class IntegerToBinary {

	public static void main(String[] args) {
		
	 System.out.println("Enter The Number::");
	 Scanner sc = new Scanner(System.in);
	 int int1 = sc.nextInt();
	 IntegerToBinary1.Binary(int1);
	 
	}
}
