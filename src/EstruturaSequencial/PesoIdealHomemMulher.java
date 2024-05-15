package EstruturaSequencial;

import java.util.Scanner;

public class PesoIdealHomemMulher {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite sua Altura --> ");
        double h = e.nextDouble();
        double homem = 72.7 * h - 58.0;
        double mulher = 62.1 * h - 44.7;
        System.out.println("Caso seja um Homem, seu peso ideal conforme a aultura(0,0) informada é --> " + homem);
        System.out.println("Caso seja um Mulher, seu peso ideal conforme a aultura(0,0) informada é --> " + mulher);
    }
}
