package chapter03;

import java.util.Scanner;

public class Quiz02_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		int d = a%b;
		
		
		System.out.printf("%d ������ %d �� ���� %d�Դϴ�. \n",a,b,c);
		System.out.printf("%d ������ %d �� �������� %d�Դϴ�.",a,b,d);
		

	}

}
