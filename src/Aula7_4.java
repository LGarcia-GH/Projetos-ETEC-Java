import java.util.Scanner;

public class Aula7_4 {
    public static void main(String[] args) throws Exception {

        // Número maior

        Scanner ler = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o número 1");
        numero1 = ler.nextInt();

        System.out.println("Digite o número 2");
        numero2 = ler.nextInt();

        if (numero1 > numero2) {
            System.out.println("Número " + numero1 + " é maior");
        }
        if (numero1 == numero2) {
            System.out.println("Os números são iguais com o valor de " + numero1);
        }
        if (numero1 < numero2) {
            System.out.println("Número " + numero2 + " é maior");
        }

    }

}