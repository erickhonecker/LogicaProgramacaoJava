package EstruturaSequencial;

import java.util.Scanner;

public class Soma_03 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = e.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = e.nextInt();
        int soma = num1 + num2;
        System.out.println("O valor da soma é --> " + soma);
    }
}
