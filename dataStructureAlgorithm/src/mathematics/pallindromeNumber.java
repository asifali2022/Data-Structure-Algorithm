
package mathematics;


class checkPallindrome{
	
	public boolean checkpallindromeNumber(int a) 
	{  
		int remainder=0;
		int reversed=0;
		while(remainder>0)
		{
		     remainder=a%10;
		    reversed=reversed*10+remainder;
		    a=a/10;
		}
		if(reversed==remainder)
		return true;
		else
			return false;
			
	}
}
public class pallindromeNumber {

	public static void main(String[] args) {
		
		checkPallindrome ch=new checkPallindrome();
		boolean a=ch.checkpallindromeNumber(444);
		System.out.println(a);

	}

}
