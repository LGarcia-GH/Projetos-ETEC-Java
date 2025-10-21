import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        float peso,altura,imc;
        String nome;

        System.out.println("Digite seu nome ");
        nome = ler.nextLine();

        System.out.println("Digite seu peso ");
        peso = ler.nextFloat();

        System.out.println("Digite sua altura ");
        altura = ler.nextFloat();

        imc = (peso / (altura * altura));

        // (System.out.printf) é um codigo de mensagem formatada e o (%.2f%n) formata a predefinição de 4 casas


        System.out.printf("O "+nome+" tem o IMC %.2f%n",imc);

    }

}
