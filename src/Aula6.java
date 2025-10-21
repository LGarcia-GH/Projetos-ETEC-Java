import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) throws Exception {

        // Conversão de Graus Celsius

        Scanner ler = new Scanner(System.in);
        Double kelvin, fahrenheit, celsius;

        System.out.println("Digite a temperatura em graus celsius ");
        celsius = ler.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        kelvin = celsius + 273.15;

        System.out.printf("A temperatura digitada em Fahrenheit é: %.2f\n", fahrenheit);
        System.out.printf("e em kelvin é: %.2f\n", kelvin);

    }

}