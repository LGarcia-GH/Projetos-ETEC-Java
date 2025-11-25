import java.util.Scanner;

public class Aula14 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numero, contador = 0, tabuada;

        System.out.println("Digite um número: ");
        numero = ler.nextInt();

        for ( contador = 1; contador <= 10; contador++) {
            tabuada = numero * contador;
            System.out.println( + numero + " x " + contador + " = " + tabuada);
        }
    }
}

