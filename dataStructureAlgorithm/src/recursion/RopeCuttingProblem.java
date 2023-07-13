package recursion;

import java.util.Scanner;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		System.out.println("Enter The Variable");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of A::");
		int a = sc.nextInt();
		System.out.println("Enter Value Of J::");
		int j = sc.nextInt();
		System.out.println("Enter Value Of K::");
		int k = sc.nextInt();
		System.out.println("Enter Value Of L::");
		int l = sc.nextInt();
		int var = cut( a, j, k, l);
		System.out.println("Rope Can be cut in max "+var+" pieces");

	}
public static int cut(int a,int j,int k,int l) {
	if(a==0)
		return 0;
	if(a<0)
		return -1;
	
	int res=Math.max(cut( a-j, j, k, l),Math.max(cut( a-k, j, k, l), cut( a-l, j, k, l)));
	if(res==-1)
		return -1;
	return res+1;
}
}
