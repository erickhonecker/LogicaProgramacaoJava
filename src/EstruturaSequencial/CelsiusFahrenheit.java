package EstruturaSequencial;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o valor em Celsius --> ");
        double c = e.nextDouble();
        double f = c * 9.0 / 5.0 + 32.0;
        System.out.println("" + c + " °C convertido para Fahrenheit é ---> " + f + "°F");
    }
}
