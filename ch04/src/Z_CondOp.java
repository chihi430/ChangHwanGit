
public class Z_CondOp {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("ū �� : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1 );
		System.out.println("���밪 : " + diff);

		int num5 = 10;
		int num6 = 20;
		System.out.println(num5 + num6);

		int num7 = 33;
		int num8 = 55;
		System.out.println(num7 + num8);

	}
	

}
