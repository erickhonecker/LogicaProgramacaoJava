package EstruturaSequencial;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o valor de Fahrenheit --> ");
        double f = e.nextDouble();
        double c = 5.0 * ((f - 32.0) / 9.0);
        System.out.println("" + f + "°F Fahrenheit convertido para Celsius é --> " + c + "°C");
    }

}
