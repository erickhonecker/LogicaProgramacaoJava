package EstruturaSequencial;

import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o valor em centímetros --> ");
        double c = e.nextDouble();
        double m = c / 100.0;
        System.out.println("" + c + "cm convertido para metros é igual --> " + m + "m");
    }
}
