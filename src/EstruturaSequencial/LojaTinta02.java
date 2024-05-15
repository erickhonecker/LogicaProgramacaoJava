package EstruturaSequencial;

import java.util.Scanner;

public class LojaTinta02 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double litroLata = 18.0;
        double litroGaloes = 3.6;
        System.out.println("Qual a quantidade de metros quadrados da area a ser pintada? ");
        double tamanhoArea = e.nextDouble();
        double litrosTinta = tamanhoArea / 6.0;
        System.out.println();
        System.out.println("----------- Latas ------------");
        System.out.println("Litros de tinta --> " + litrosTinta);
        double precoTotalLata = litrosTinta * 80.0 / 18.0;
        double qtdLata = litrosTinta / 18.0;
        System.out.printf("Quantidade de latas necessárias é --> %.1f %n", qtdLata);
        System.out.printf("Preço total --> R$ %.2f %n ", precoTotalLata);
        System.out.printf("Area total --> " + tamanhoArea + "²");
        System.out.println();
        System.out.println("----------- Galões ------------");
        System.out.println("Litros de tinta --> " + litrosTinta);
        double precoTotalGaloes = litrosTinta * 25.0 / 3.6;
        double qtdGaloes = litrosTinta / 3.6;
        System.out.printf("Quantidade de Galões necessários é --> %.1f %n", qtdGaloes);
        System.out.printf("Preço total --> R$ %.2f %n ", precoTotalGaloes);
        System.out.printf("Area total --> " + tamanhoArea + "²");
    }
}
