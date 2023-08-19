package BitWiseOperatorInJava;

public class BitWiseLeftShiftOperator {

	public static void main(String[] args) {
		
		int x=3;
		System.out.println(x<<1);
		System.out.println(x<<2);
		int y=4;
		System.out.println(x<<y);

	}

}
// binary     
//3::        |00000000000000000000000000000011
//3<<1      0|00000000000000000000000000000110 add 0 to MSB and SHIFT LSB BY 1
//3<<2     00|00000000000000000000000000001100 add 0 0 to MSB and SHIFT LSB BY 2
//-1         |11111111111111111111111111111111
//-1<<1     1|11111111111111111111111111111110  =-2
//-1<<2    11|11111111111111111111111111111100  =-4
//BINARY NO (+VE)==2^32
//BINARY NO (-VE)==2^32-X X{NUMBER}
//X<<Y  ===>> ( X * (2^Y) )
//3<<4  ===>> ( 3 * (2^4) ) ===>> 48
