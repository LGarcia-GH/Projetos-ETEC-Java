import java.util.Scanner;

public class Aula8_2 {
    public static void main(String[] args) throws Exception {

        // Idade para voto

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        if (idade >= 16) {
            System.out.println("Você tem idade requisitada para votar!");
        } else if (idade <= 0) {
            System.out.println("A idade digitada não é valida");
        } else {
            System.out.println("VOCÊ NÃO TEM IDADE PARA VOTAR!!!");
        }

    }

}
