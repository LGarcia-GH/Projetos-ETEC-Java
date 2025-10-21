import java.util.Scanner;

public class Aula8_3 {
    public static void main(String[] args) throws Exception {

        // Medidor de temperatura

        Scanner ler = new Scanner(System.in);

        float graus;

        System.out.println("Digite quando Graús Celcius está o ambiente está no momento:");
        graus = ler.nextFloat();

        if (graus < 0) {
            System.out.println("A TÁ FRIOOOOOO!!!");
        } else if (graus > 25) {
            System.out.println("A TÁ PEGANDO FOGO BIXO!!!!!!");
        } else {
            System.out.println("A temperatura está agradavel :)");

        }

    }

}