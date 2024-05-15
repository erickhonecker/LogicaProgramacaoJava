package EstruturaSequencial;

import java.util.Scanner;

public class JoaoPescador {
    public static void main(String[] args) {
        double pesoRegulamento = 50.0;
        double multaExcedente = 4.0;
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o peso total dos peixes --> ");
        double peso = e.nextDouble();
        System.out.println("O peso total é " + peso + "Kg");
        double excesso = peso - pesoRegulamento;
        System.out.println("O peso excedente é --> " + excesso + "Kg");
        double multa = excesso * multaExcedente;
        System.out.println("O valor da multa a ser paga por kilos excedidos é --> R$" + multa);
    }
}

