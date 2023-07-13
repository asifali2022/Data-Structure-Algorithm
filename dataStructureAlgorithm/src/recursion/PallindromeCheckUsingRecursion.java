package recursion;

import java.util.Scanner;

public class PallindromeCheckUsingRecursion {

	public static void main(String[] args) {
	System.out.println("Enter The String::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int n = str.length();	
	int st=0;
	int e=n-1;
	System.out.println(isPal(str,st,e));
		
	}
static public boolean isPal(String s,int st,int e)
{
	if (st>=e) {
		return true;
	}
	return (s.charAt(st)==s.charAt(e))&& isPal(s,st+1,e-1);
	
	
	
}
}
