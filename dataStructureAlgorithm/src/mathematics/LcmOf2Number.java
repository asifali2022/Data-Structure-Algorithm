package mathematics;


//generic solution
//time complexity 0(A*B-MAX(A,B))
class lcm{
	
	static int lcm(int a,int b)
	{
		int lcm=1;
		int max=Math.max(a,b);
		int i=max;
		while( i>=max)
		{
			if((i%a==0)&&(i%b==0))
			{
				lcm=i;
				break;
			}
			i++;
		}
		return lcm;
	}
}
//lcm using euclidean method
//product of two no == hcf*lcm
//efficient solution
class euclid{
	
	static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
}



public class LcmOf2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l=lcm.lcm(3,7);
		System.out.println(l);
		
		System.out.println("***********");
		//efficient solution
		int n=euclid.lcm(10,15);
		System.out.println(n);
	}

}
