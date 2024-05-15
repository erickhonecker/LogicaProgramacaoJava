package EstruturaDeDecisao;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.println("Digite a primeira nota do aluno --> ");
		nota1 = e.nextDouble();
		System.out.println("Digite a segunda nota do aluno --> ");
		nota2 = e.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 9) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");

		}else {
			System.out.println("Aprovado com Distin��o");
		}

	}
}
