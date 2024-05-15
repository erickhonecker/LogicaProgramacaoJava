package EstruturaSequencial;

import java.util.Scanner;

public class LojaTinta01 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double valorLitroLata = 18.0;
        System.out.println("Qual a quantidade de metros quadrados da area a ser pintada? ");
        double tamanhoArea = e.nextDouble();
        double litrosTinta = tamanhoArea / 3.0;
        System.out.println("Litros de tinta --> " + litrosTinta);
        double precoTotal = litrosTinta * 80.0 / 18.0;
        double qtdLata = litrosTinta / 18.0;
        System.out.printf("Quantidade de latas necessárias é --> %.1f %n", qtdLata);
        System.out.printf("Preço total --> R$ %.2f %n ", precoTotal);
        System.out.printf("Area total --> " + tamanhoArea + "²");
    }
}
