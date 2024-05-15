package EstruturaDeDecisao;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		double num1, num2, num3;

		System.out.println("Digite o primeiro n�mero -->");
		num1 = e.nextDouble();
		System.out.println("Digite o segundo n�mero -->");
		num2 = e.nextDouble();
		System.out.println("Digite o terceiro n�mero --> ");
		num3 = e.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero � --> " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero � --> " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior n�mero � --> " + num3);

		} else {
			System.out.println(
					"Os n�meros s�o iguais " + " -> " + num1 + " -> " + num2 + " -> " + num3);
		}

	}

}
