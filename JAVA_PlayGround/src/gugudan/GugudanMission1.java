package gugudan;

import java.util.Scanner;

public class GugudanMission1 {
	

	public static void main(String[] args) {
		System.out.print("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
    
		// 세로
		for(int i = 2; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		// 가로
		for(int i = 1; i <= num; i++) {
			for(int j = 2; j <= num; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
	}
}