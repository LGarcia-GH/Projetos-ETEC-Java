import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) throws Exception {

        // Leitor de Idade

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        if (idade <= 17) {
            System.out.println("Você é menor de idade com " + idade + " anos");
        } else {
            System.out.println("Você é maior de idade com " + idade + " anos");
        }

    }

}
