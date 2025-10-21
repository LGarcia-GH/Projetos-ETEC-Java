import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
      Double lucroBase, lucroFinal, imposto;

      System.out.println("Quanto foi o seu lucro ");
      lucroBase = ler.nextDouble();

      imposto = lucroBase * 0.15;
      lucroFinal = lucroBase - imposto;

      System.out.println("Seu lucro final é de " + lucroFinal + " Com um imposto de " + imposto);

    }

}