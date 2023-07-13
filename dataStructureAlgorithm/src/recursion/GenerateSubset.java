package recursion;

import java.util.Scanner;

public class GenerateSubset {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The String::");
	String j = sc.nextLine();
	String k="";
	int l=0;
	set(j,k,l);

	}
static public void set(String s,String d,int f)
{
	if (f==s.length()) {
		System.out.print("{"+d+"}"+" ");
		return;
		
	}
	set(s,d,f+1);
	set(s,d+s.charAt(f),f+1);
}
}
