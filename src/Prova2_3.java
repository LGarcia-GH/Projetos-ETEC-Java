import java.util.Scanner;

public class Prova2_3 {
    public static void main(String[] args) throws Exception {

        //Conversor de Moeda

        Scanner ler = new Scanner(System.in);

       double reais, conversao = 0;
       
       int opcao;

       System.out.println("Conversor de Moeda");
       System.out.println("Digite o Valor a ser Convertido: ");
       reais = ler.nextDouble();

       System.out.println("Escolha a Opção de Moeda para Conversão");
       System.out.println("1 - Dólar");
       System.out.println("2 - Euro");
       System.out.println("3 - Libra");
       opcao = ler.nextInt();

        if (opcao == 1){
            conversao = reais / 5.20;
        } else if (opcao == 2) {
            conversao = reais / 5.60;
        } else if (opcao == 3) {
            conversao = reais / 6.40;
        } else {
            System.out.println("Opção Invalida");
        }
        System.out.println("O Valor de R$:" + reais);
        System.out.printf("Na conversão resultou em: %.2f%n ",conversao);

    }
}

