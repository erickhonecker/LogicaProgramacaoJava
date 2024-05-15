package EstruturaDeDecisao;

import java.util.Scanner;

public class NumPosiNega {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro número --> ");
        double num1 = e.nextDouble();
        if (num1 >= 0.0) {
            System.out.println("O número digitado é positivo!");
        } else {
            System.out.println("O numero digitado é negativo!");
        }

    }
}
