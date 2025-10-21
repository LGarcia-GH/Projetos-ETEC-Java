import java.util.Scanner;

public class Aula7_C {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numero1, numero2, contador;

        contador = 1;

        System.out.println("Digite o " + contador +"° número:");
        numero1 = ler.nextInt();

        contador = contador + 1;

        System.out.println("Digite o " + contador +"° número:");
        numero2 = ler.nextInt();

        if ( numero1 < 0 || numero2 < 0) {
            System.out.println("O número não pode ser negativo");
        } else if ( numero1 > numero2 ) {
            System.out.println("O 1° número e maior");
        } else if ( numero1 < numero2 ) {
            System.out.println("O 2° número e maior");
        } else {
            System.out.println("Os dois números são iguais");
        }

    }

}
