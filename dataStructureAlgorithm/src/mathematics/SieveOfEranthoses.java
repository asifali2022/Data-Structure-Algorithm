package mathematics;

import java.util.Arrays;

class sieve{
	
	static void eran(int a)
	{
		for(int i=2;i<=a;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
		}
	}
	}
	//optimized solution
	void eran2(int a)
	{
		boolean [] h=new boolean[a+1];
		Arrays.fill(h,true);
		for(int i=2;i*i<=a;i++)
		{
			if(isPrime(i))
			{
				for(int j=2*i;j<=a;j=j+i)
				{
					h[j]=false;
				}
				
			}
		}
		for(int i=2;i<a;i++)
		{
			if(h[i]==true)
			{
			System.out.println(i);
			}
		}
		
	}
	//
		static boolean isPrime(int a)
	{
		if (a==1)
		{
			return false;
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
		}
	}



public class SieveOfEranthoses {

	public static void main(String[] args) {
		
		sieve i=new sieve();
		i.eran(10);
        System.out.println("**************");
        i.eran2(12);
	}

}
