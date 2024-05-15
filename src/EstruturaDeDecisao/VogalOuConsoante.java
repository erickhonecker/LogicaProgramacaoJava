package EstruturaDeDecisao;

import java.util.Scanner;

public class VogalOuConsoante {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letter = e.next();
        if (!letter.equalsIgnoreCase("A") && !letter.equalsIgnoreCase("E") && !letter.equalsIgnoreCase("I") && !letter.equalsIgnoreCase("O") && !letter.equalsIgnoreCase("U")) {
            System.out.println("A letra que voce digitou é uma consoante");
        } else {
            System.out.println("A letra que você digitou é uma Vogal!");
        }

    }

}
