import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) throws Exception {

    //Contador de Inpar e Par

    Scanner ler = new Scanner(System.in);

    int contador = 1, i = 1;
    double numeros, contI = 0, contP = 0, inparPar = 0;

    System.out.println("Digite 5 Números Aleatorios: ");

    while (i <= 5) {
        System.out.println(contador +"° Número");
        numeros = ler.nextDouble();
        i += 1;
        contador += 1;
        inparPar = numeros % 2;

        if (inparPar == 0) {
            contP += 1;
        } else {
            contI += 1;
        }
}

    System.out.println("Você tem " + contP + " Números Pares e " + contI + " Números Inpar");

    }
}

