package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Of People::");
		int people = sc.nextInt();
		System.out.println("Enter The Knockout Index::");
		int kindex = sc.nextInt();
		int dindex=0;
		sol(people,kindex,dindex);
	}

	public static int sol(int people,int kindex,int dindex)
	{
		if(people==1)
			return 0;
		sol( people-1, kindex, dindex+1);
		
		return 8;
	}
	static ArrayList<String> powerSet(String s)
    {
		return null;
       
    }
}

