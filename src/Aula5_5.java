import java.util.Scanner;

public class Aula5_5 {
    public static void main(String[] args) throws Exception {

        // Calculo de Imposto sobre investimento

        Scanner ler = new Scanner(System.in);
        Double lucroBase, lucroFinal, imposto;

        System.out.println("Quanto foi o seu lucro ");
        lucroBase = ler.nextDouble();

        imposto = lucroBase * 0.15;
        lucroFinal = lucroBase - imposto;

        System.out.println("Seu lucro foi de " + lucroFinal + " com um imposto de " + imposto);

    }

}
