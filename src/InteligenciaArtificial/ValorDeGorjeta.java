package InteligenciaArtificial;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ValorDeGorjeta {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        double servico_pobre, servico_regular, servico_bom;
        double comida_ruim, comida_aceitavel, comida_boa;
        double tip_baixa, tip_normal, tip_alta, tip_valor;
        double qualidade_servico;
        double qualidade_comida;

        System.out.println("Qual a nota para a qualidade do serviço?  ");
        qualidade_servico = e.nextDouble();
        System.out.println("Qual a nota para a qualidade da comida?  ");
        qualidade_comida = e.nextDouble();

        servico_pobre = Math.max(0,1 - (qualidade_servico - 1)/2);
        servico_regular = Math.max(0,1 - abs(qualidade_servico - 3)/2);
        servico_bom = Math.max(0, (qualidade_servico - 3)/2);

        //definições das funções de pertinencia para comida
        comida_ruim = Math.max(0,1 - (qualidade_comida - 1)/2);
        comida_aceitavel = Math.max(0,1 - (qualidade_comida - 3)/2);
        comida_boa = Math.max(0, - (qualidade_comida - 3)/2);

        //regras fuzzy para calcular a gorjeta
        tip_baixa = Math.min(servico_pobre, comida_ruim);
        tip_normal = Math.min(servico_regular,comida_aceitavel);
        tip_alta = Math.min(servico_bom, comida_boa);

        //Calculo do valor da gorjeta
        tip_valor = (tip_baixa * 0 + tip_normal * 10 + tip_alta * 15) / (tip_baixa+tip_normal+tip_alta);

        System.out.println("------ Valor do servico -------");
        System.out.println(servico_pobre);
        System.out.println(servico_regular);
        System.out.println(servico_bom);

        System.out.println("------ Valor da comida -------");
        System.out.println(comida_ruim);
        System.out.println(comida_aceitavel);
        System.out.println(comida_boa);

        System.out.println("------ Valor das Tips -------");
        System.out.println(tip_baixa);
        System.out.println(tip_normal);
        System.out.println(tip_alta);

        System.out.println("------ valor da gorjeta -------");
        System.out.println("Valor da gorjeta --> " + tip_valor);
    }
}
