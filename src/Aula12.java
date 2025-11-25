import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int i, numeroGigitado, somaPares = 0;

        for(i=1; i<6; i++){
            System.out.println("Digite o " + i + "° Número");
            numeroGigitado = ler.nextInt();

            if (numeroGigitado % 2 == 0) {
                somaPares += numeroGigitado;
            }
        }

    }
}

