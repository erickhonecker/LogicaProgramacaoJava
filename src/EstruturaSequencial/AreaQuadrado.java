package EstruturaSequencial;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a altura do quadrado --> ");
        double altura = e.nextDouble();
        double area = altura * altura;
        System.out.println("A área do quadrado é --> " + area);
        area = altura * altura * 2.0;
        System.out.println("O dobro da área do quadrado é igual a --> " + area);
    }
}
