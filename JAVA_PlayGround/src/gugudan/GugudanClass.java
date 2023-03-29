package gugudan;

public class GugudanClass {

	public static void main(String[] args) {
		for(int j = 2; j < 10; j++) {
			int[] result = GugudanMethod.calculate(j);
			GugudanMethod.print(result);
		}
	}
}