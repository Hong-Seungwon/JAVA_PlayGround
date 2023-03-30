package gugudan;

import java.util.Scanner;

public class GugudanMission2 {

	public static void main(String[] args) {
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] split = input.split(",");
		
		int num1 = Integer.parseInt(split[0]);
		int num2 = Integer.parseInt(split[1]);
		
		// 세로
		for(int i = 2; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.println(i + " * " + j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		// 가로
		for(int i = 1; i <= num2; i++) {
			for(int j = 2; j <= num1; j++) {
				System.out.printf(j + " * " + i + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}