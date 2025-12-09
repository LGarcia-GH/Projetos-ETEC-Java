import java.util.Scanner;

public class Aula17 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        float numero, positivo = 0, negativo = 0, zero = 0;

        int i = 0, vezes;

        System.out.println("Digite quantos números você quer: ");
        vezes = ler.nextInt();

        for ( i=1; i <= vezes; i++) {
            System.out.println("Digite o " + i + "° número");
            numero = ler.nextFloat();

            if ( numero > 0) {
                positivo += 1;
            } else if ( numero < 0) {
                negativo += 1;
            } else {
                zero += 1;
            }
        }

        System.out.println("Você digitou:");
        System.out.println(  positivo +" Números positivos");
        System.out.println(  negativo +" Números negativos");
        System.out.println(zero + " Números zeros");


    }
}

