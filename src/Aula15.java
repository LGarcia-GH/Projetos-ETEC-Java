import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double numero, soma = 0;

        System.out.println("Digite um Número ou 0 para parar:" );
        numero = ler.nextDouble();

        while(numero != 0) {
            soma += numero;

            System.out.println("Digite um número ou Zero para parar:" );
            numero = ler.nextDouble();
        }

        System.out.println("A soma de todos os números é: " + soma);
    }
}

