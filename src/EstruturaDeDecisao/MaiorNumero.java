

package EstruturaDeDecisao;

import java.util.Scanner;

public class MaiorNumero {
    public MaiorNumero() {
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro número --> ");
        double num1 = e.nextDouble();
        System.out.println("Digite o segundo número --> ");
        double num2 = e.nextDouble();
        if (num1 > num2) {
            System.out.println("O maior número é ---> " + num1);
        } else {
            System.out.println("O maior número é ---> " + num2);
        }

    }
}
