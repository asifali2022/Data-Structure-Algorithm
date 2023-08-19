package mathematics;

class primfactors{
	void primefactors(int a)
	{
		if (a<=1)
		{
			return;
		}
		for(int i=2;i*i<a;i++)
		{
			while(a%i==0)
			{
				System.out.println(i);
				a=a/i;
			}
		}
		if(a>1)
		{
			System.out.println(a);
		}
	}
}

class pFactor{
	
	void primeFactor(int k)
	{
		for(int i=2;i<k;i++)
		{
			if(prime(i))
			{
				int x=i;
				while(k%x==0)
				{
					System.out.println(i);
					x=x*i;
				}
			}
			
		}
	}
	///
	static boolean prime(int a)
	{    
		if(a==1)
			return false;
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

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pFactor l=new pFactor();
		l.primeFactor(12);
		System.out.println("**************************");
		primfactors n=new primfactors();
		n.primefactors(450);
		
	}

}
