import java.util.Scanner;

public class Aula5_2 {
    public static void main(String[] args) throws Exception {

        // Calculo de bonificação em 5% do valor total de vendas

        // Entrada de Dados

        Scanner ler = new Scanner(System.in);
        double salario, valorVendas, salarioFinal, bonificacao;

        System.out.println("Digite o salario do funcionario ");
        salario = ler.nextDouble();

        System.out.println("Digite o valor total de vendas ");
        valorVendas = ler.nextDouble();

        // Processamento de Dados

        bonificacao = valorVendas * 0.05;

        salarioFinal = salario + bonificacao;

        // Saida de Dados

        System.out.println("O salario final do funcionario será: R$ " + salarioFinal);

    }

}