package chapter03;

import java.util.Scanner;

public class Quiz02_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c =  a > b  ?  a : b ;
				
		System.out.printf("�� ���� �� ū ���� %d �Դϴ�." , c);

	}

}