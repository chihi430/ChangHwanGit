package chapter03;

import java.util.Scanner;

public class Quiz02_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b ;
		int d;
				
		d = c > 0 ? c  : -c;
		
		System.out.println("Àý´ë°ª : "+ d);
		
		
	}

}
