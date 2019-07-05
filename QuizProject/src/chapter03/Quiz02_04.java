package chapter03;

import java.util.Scanner;

public class Quiz02_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c =  a > b  ?  a : b ;
				
		System.out.printf("두 정수 중 큰 값은 %d 입니다." , c);

	}

}