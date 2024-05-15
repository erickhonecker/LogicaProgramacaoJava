package EstruturaSequencial;

import java.util.Scanner;

public class HoleriteSalario {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Quanto você ganha por Hora? ");
        double salarioHora = e.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês? ");
        double horaTrab = e.nextDouble();
        double salarioBruto = salarioHora * horaTrab;
        System.out.println("Salário Bruto --> R$" + salarioBruto);
        double ir = salarioBruto / 100.0 * 11.0;
        System.out.println("O valor do ir (- 11% -) é --> R$" + ir);
        double inss = salarioBruto / 100.0 * 8.0;
        System.out.println("O valor do INSS (- 8% -) é --> R$" + inss);
        double sindCA = salarioBruto / 100.0 * 5.0;
        System.out.println("O valor do Sindicato (- 5% -) é --> R$" + sindCA);
        double salarioLiquido = salarioBruto - ir - inss - sindCA;
        System.out.println("Salário Liquido --> R$" + salarioLiquido);
    }
}
