import java.util.Scanner;

public class Prova1_2 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade");
        idade = ler.nextInt();

        if (idade <= 0) {
            System.out.println("Idade invalida");
        } else if (idade <= 12 && idade > 0) {
            System.out.println("Você é criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é adolecente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é envelhecido");
        }

    }

}