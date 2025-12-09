import java.util.Scanner;

public class Prova2_4 {
    public static void main(String[] args) throws Exception {

        //Melhor Cargo

        Scanner ler = new Scanner(System.in);

        double salarios, salarioFinal = 0;

        int contar, contador = 1;

        String emprego, empregoFinal = "a";

        System.out.println("Digite Quantos Salarios Você tem: ");
        contar = ler.nextInt();

        while (contar > 0) {
            System.out.println("Digite o " + contador + "° Cargo: ");
            salarios = ler.nextDouble();
            ler.nextLine();
            System.out.println("Digite o Nome do " + contador + "° Emprego: ");
            emprego = ler.nextLine();

            contador += 1;
            contar -= 1;

            if (salarioFinal < salarios) {
                salarioFinal = salarios;
                empregoFinal = emprego;
            }
        }

        System.out.println("O Maior Salario é do Cargo de " + empregoFinal);
        System.out.printf("Com Valor de R$: %.2f%n", salarioFinal);

    }
}

