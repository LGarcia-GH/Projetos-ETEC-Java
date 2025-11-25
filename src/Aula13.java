import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numeroSalarios, contador;

        double mediaSalario = 0;

        System.out.println("Digite quantos salarios você tem: ");
        numeroSalarios = ler.nextInt();

        for(contador = 1; contador <= numeroSalarios; contador++) {
            System.out.println("Digite seu " + contador + "° salario R$: ");
            mediaSalario += ler.nextFloat();
        }

        mediaSalario /= numeroSalarios;

        System.out.printf("Você tem " + numeroSalarios + " salarios com uma média de R$:%.2f%n",mediaSalario);
    }
}

