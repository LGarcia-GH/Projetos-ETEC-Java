import java.util.Scanner;

public class Aula5_3 {
    public static void main(String[] args) throws Exception {

        // Calculo da Área do Triângulo

        // Entrada de Dados

        Scanner ler = new Scanner(System.in);
        float base, altura, area;

        System.out.println("Digite o valor da base: ");
        base = ler.nextFloat();

        System.out.println("Digite o valor da altura: ");
        altura = ler.nextFloat();

        // Processamento de Dados

        area = (base * altura) / 2;

        // Saida de Dados

        System.out.println("A área do triângulo é: " + area);

    }

}
