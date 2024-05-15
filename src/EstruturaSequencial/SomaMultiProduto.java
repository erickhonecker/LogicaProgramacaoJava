package EstruturaSequencial;

import java.util.Scanner;

public class SomaMultiProduto {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro númeor inteiro --> ");
        int num1 = e.nextInt();
        System.out.println("Digite o segundo número inteiro --> ");
        int num2 = e.nextInt();
        System.out.println("Digite o terceiro número do tipo Real -->");
        double num3 = e.nextDouble();
        double soma = (double)(num1 * 3) + num3;
        System.out.println("o produto do dobro do primeiro com metade do segundo é --> " + num1 * 2 + num2 / 2);
        System.out.println("A soma do triplo do primeiro com o terceiro --> " + soma);
        System.out.println("o terceiro elevado ao cubo é --> " + Math.pow(num3, 3.0));
    }
}
