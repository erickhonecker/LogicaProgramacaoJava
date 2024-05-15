package EstruturaSequencial;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner e = new Scanner(System.in);
        System.out.println("Informe o valor do raio --> ");
        double r = e.nextDouble();
        double a = pi * r * r;
        System.out.println("O valor da área da circuferência é --> " + a);
    }
}
