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
	//
	void eran2(int a)
	{
		boolean [] h=new boolean[a];
		Arrays.fill(h,true);
		
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

	}

}
