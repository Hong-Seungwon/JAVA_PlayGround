package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 2�� 
//		System.out.println("2��");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		// 3��
//		System.out.println("3��");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		// 4��
//		System.out.println("4��");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		System.out.println("������ �� ����� ����?");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num * 1);
//		System.out.println(num * 2);
//		System.out.println(num * 3);
//		System.out.println(num * 4);
//		System.out.println(num * 5);
//		System.out.println(num * 6);
//		System.out.println(num * 7);
//		System.out.println(num * 8);
//		System.out.println(num * 9);
		
		// 6��
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1; // i += 1;  i++;
//		}
		
		// 7��
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
		// 8, 9��
		System.out.println("������ �� ����� ����?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + num);
		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(num * i);
//		}

		if(num < 2) {
			System.out.println("���� �߸� �Է�");
		}else if(num > 9) {
			System.out.println("���� �߸� �Է�");
		}else {
			for(int i = 1; i < 10; i++) {
				System.out.println(num * i);
			}			
		}
	}
}