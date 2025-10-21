import java.util.Scanner;

public class Aula7_3 {
    public static void main(String[] args) throws Exception {

        // Calculo de aumento

        Scanner ler = new Scanner(System.in);

        double salario, horas, aumento, salarioFinal;

        System.out.println("Quantas horas você trabalhou na semana?");
        horas = ler.nextDouble();

        System.out.println("Quanto é o seu salario base?");
        salario = ler.nextDouble();

        if (horas >= 35) {
            aumento = salario * 0.20;
            salarioFinal = aumento + salario;
            System.out.println("Seu salario terá um aumento de 20% com valor de: " + aumento);
            System.out.println("Seu salario final será: " + salarioFinal);
        } else {
            System.out.println("você não trabalhou horas o suficiente para um aumento :(");
        }

    }

}
