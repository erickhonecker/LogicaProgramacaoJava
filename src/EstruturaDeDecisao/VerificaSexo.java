package EstruturaDeDecisao;


import java.util.Scanner;

public class VerificaSexo {


    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite F - Feminino ou M - Masculino --> ");
        String sexo = e.next();
        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Invalido!");
        }

    }
}