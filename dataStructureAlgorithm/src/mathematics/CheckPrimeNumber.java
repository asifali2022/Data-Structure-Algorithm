package mathematics;

class check{
	
	
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
	
//optimized solution traversing from 2 to n^(1/2)
	static boolean prime1(int a)
	{    
		if(a==1)
			return false;
		for(int i=2;i*i<=(a);i++)  //i<=Math.sqrt(a)= same as= i*i<=a
		{
			if(a%i==0)
			{
				return false;
		        
			}	
	    }
		return true;
		
}	
	
	// more optimized solution traversing from 2 to n^(1/2)
	// corner cases for handling multiple of 2 and 3
	//suitable for very large value of n
	
		static boolean prime12(int a)
		{    
			if(a==1)
				return false;
			if(a==2 || a==3)
				return true;
			if(a%2==0 || a%3==0)
				return false;
			for(int i=5;i*i<=(a);i=i+6)  
			{
				if(a%i==0|| a%(i+2)==0)
				{
					return false;
			        
				}	
		    }
			return true;
			
	}	
	
	
}

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		boolean o=check.prime(65);
		System.out.println(o);
		
		//optimized solution
		boolean p=check.prime1(73);
		System.out.println(p);
		//
		boolean l=check.prime12(165);
		System.out.println(l);
		
		

	}

}
