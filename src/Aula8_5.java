import java.util.Scanner;

public class Aula8_5 {
    public static void main(String[] args) throws Exception {

        // Média de aluno

        Scanner ler = new Scanner(System.in);

        Float media, nota1, nota2, nota3, nota4;
        int numeracao;

        numeracao = 1;

        System.out.println("Digite a " + numeracao + "° nota:");
        nota1 = ler.nextFloat();
        numeracao = numeracao + 1;

        System.out.println("Digite a " + numeracao + "° nota:");
        nota2 = ler.nextFloat();
        numeracao = numeracao + 1;

        System.out.println("Digite a " + numeracao + "° nota:");
        nota3 = ler.nextFloat();
        numeracao = numeracao + 1;

        System.out.println("Digite a " + numeracao + "° nota:");
        nota4 = ler.nextFloat();
        numeracao = numeracao + 1;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media < 0) {
            System.out.println("Não exite média negativa!!!");
        } else if ((media >= 7) && (media <= 8.9)) {
            System.out.println("Você foi aprovado com a média de " + media);
        } else if (media < 5) {
            System.out.println("Você foi reprovado com a média de " + media);
        } else if ((media >= 9) && (media <= 10)) {
            System.out.println("Você foi aprovado com a média excelente de " + media);
        } else {
            System.out.println("Você está de recuperação com a média de " + media);
        }

    }

}