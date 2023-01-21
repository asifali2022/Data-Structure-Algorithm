package BitWiseOperatorInJava;

public class BitWiseNOTOperator {

	public static void main(String[] args) {
		int x=5;
		System.out.println(~x);
	}
}
// 1:: binary representation of  5=00000000000000000000000000000 101
// 2:: binary representation of ~5=11111111111111111111111111111 010 (2^(32)-1(-5))
// 3:: general formula  2's compliment for negative expression : 2^(32)-x
// 4:: 1's compliment=11111111111111111111111111111111  
//     general formula for negative no is::(2^(32-1)
// 5:: ~5 == 2^(32)-1-(-5)[-5 ==>> (2^0)*1=1 +(2^2)*1=4  ==>5]