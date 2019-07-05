package chapter03;

import java.util.Scanner;

public class Quiz02_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		int d = a%b;
		
		
		System.out.printf("%d 나누기 %d 의 몫은 %d입니다. \n",a,b,c);
		System.out.printf("%d 나누기 %d 의 나머지는 %d입니다.",a,b,d);
		

	}

}
