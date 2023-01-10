package mathematics;

class factors{
	
	static void factor(int a)
	{
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}
	
	//efficient method
	static void factor1(int a)
	{
		for(int i=1;i*i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
				if(i!=a/i)
				{
					System.out.println(a/i);
				}
			}
		}
	}
	
	// more efficient method
		static void factor2(int a)
		{ int i=1;
			for( i=1;i*i<a;i++)
			{
				if(a%i==0)
				{
					System.out.println(i);
					
				}
			}
			for(;i>=1;i--)
			{
				if(a%i==0)
				{
					System.out.println(a/i);
					
				}
			}
		}

}

public class AllFactorsOfNumber {

	public static void main(String[] args) {
	
		factors b=new factors();
		b.factor(7);
	    System.out.println("*******************");
	    b.factor1(9);
	    System.out.println("*******************");
	    b.factor2(15);
		

	}

}
