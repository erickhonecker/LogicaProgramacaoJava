package EstruturaSequencial;

import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o tamanho do Arquivo para Download (MB) --> ");
        double TamMB = e.nextDouble();
        System.out.println("Digite a velocidade da internet (Mbps) --> ");
        double veloMb = e.nextDouble();
        double tempoDown = TamMB * 8.0 / veloMb / 60.0;
        System.out.printf("O tempo aproximado para download em Minutos é --> %.0f %n ", tempoDown);
    }
}
