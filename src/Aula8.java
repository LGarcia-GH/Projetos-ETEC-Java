import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) throws Exception {

        // Número negativo ou positivo

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número");
        numero = ler.nextInt();

        if (numero >= 1) {
            System.out.println("O número digitado é positivo");
        } else if (numero == 0) {
            System.out.println("O número é zero mas é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }

}
