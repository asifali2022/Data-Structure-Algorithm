package recursion;

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

public class DigitalRoot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number::");
		int t = sc.nextInt();// taking total testcases

		System.out.println(new Solution().digitalRoot(t));
		System.out.println("*************************");
	
	}
}

class Solution {
	// complete the function
	public static int digitalRoot(int n) {
		int sum = 10;
		if (n < sum) {
			return n;
		}
		n = digitalRoot2(n);
		return digitalRoot(n);
	}

	public static int digitalRoot2(int n) {
		if (n < 10)
			return n;
		return digitalRoot2(n / 10) + (n % 10);
	}

	
}
