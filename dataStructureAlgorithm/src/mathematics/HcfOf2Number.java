package mathematics;

//best method using time complexity is euclidean method
// class hcf's gcd method is generic method time complexity is
// O(min(a,b))

// EUCIDEAN METHOD--> b be smaller than a then
// gcd(a,b)=gcd(a-b,b)

//euclidean method
class euclidean{
	
	static int gcd(int a,int b)
	{   
		while(a!=b)
		{
			if(a>b)
			 a=a-b;
			else
			 b=b-a;
		}
		return a;
	}
}
// optimized euclidean method

class ModifiedEuclidean{
	
	static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
		
	}
}

//generic method
class hcf{
	
	static int gcd (int a,int b)
	{    
		int gcd=Math.min(a,b);
		
			for(int i=gcd;i>0;i--)
			{
				if((a%i==0)&&(b%i==0))
				{
					gcd=i;
					break;
				}
			}
		return gcd;
	}
}

public class HcfOf2Number {

	public static void main(String[] args) {
		
		int k=hcf.gcd(650,2500);
		System.out.println(k);
		
		int m=euclidean.gcd(650,2500);
		System.out.println(m);
		
		int y=ModifiedEuclidean.gcd(650,2500);
		System.out.println(y);
	}

}
