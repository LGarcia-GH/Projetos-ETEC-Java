import java.util.Scanner;

public class Aula5_4 {
    public static void main(String[] args) throws Exception {

        // Calculo de salario e aumento

        // Entrada de Dados

        Scanner ler = new Scanner(System.in);
        Double horasTotal, valorHora, aumento, aumentoConfirm, salario;
        String nome;

        System.out.println("Digite o nome do funcionario ");
        nome = ler.nextLine();

        System.out.println("Digite o valor da hora ");
        valorHora = ler.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês ");
        horasTotal = ler.nextDouble();

        System.out.println("Qual o valor do aumento? ");
        aumentoConfirm = ler.nextDouble();

        // Processamento de Dados

        salario = valorHora * horasTotal;

        aumento = salario * (aumentoConfirm / 100);

        // Saida de Dados

        System.out.println("O funcionario " + nome + " recebe o valor salarial de " + salario
                + " e ganhou um aumento de " + aumento);

    }

}