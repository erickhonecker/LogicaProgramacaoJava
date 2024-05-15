package EstruturaSequencial;

import java.util.Scanner;

public class MediaNotasBimestre {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a 1° Nota: ");
        double nota1 = e.nextDouble();
        System.out.println("Digite a 2° Nota: ");
        double nota2 = e.nextDouble();
        System.out.println("Digite a 3° Nota: ");
        double nota3 = e.nextDouble();
        System.out.println("Digite a 4° Nota: ");
        double nota4 = e.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média do Aluno foi --> " + media);
    }
}
