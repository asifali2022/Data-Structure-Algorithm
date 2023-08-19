package recursion;

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter The Number::");
        int t=in.nextInt();
        int [] a=new int[t];
        int [] b=new int[t];
        int [] n=new int[t];
        
        for(int i=0;i<t;i++){
             a[i] = in.nextInt();
             b[i] = in.nextInt();
             n[i] = in.nextInt();
        }
        for(int k=0;k<t;k++)
        {
        	int f=a[k];
            int d=b[k];
            int j=1;
           for(int m=1;m<n[k]+1;m++)
        {
            
            f=f+(d*j);
            j=j*2;
            System.out.print(f+" ");   
        }
           System.out.println();
        }
        in.close();
	}
}
