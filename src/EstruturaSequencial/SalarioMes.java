package EstruturaSequencial;

import java.util.Scanner;

public class SalarioMes {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada?");
        double salarioHora = e.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês? ");
        double horaMes = e.nextDouble();
        double salarioMes = salarioHora * horaMes;
        System.out.println("Seu salário mensal é --> R$" + salarioMes);
    }
}
