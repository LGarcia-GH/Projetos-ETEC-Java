import java.util.Scanner;

public class CalculadoraKm {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        String carro;
        int combustivel;
        double kmLU, kmLR, tanque, gastoCombusU, gastoCombusR, kmLUTotal, kmLRTotal, valorC = 0;

        System.out.println("Digite o nome do veiculo: ");
        carro = ler.nextLine();

        System.out.println("Digite quantos litros ou energia ele suporta: ");
        tanque = ler.nextDouble();

        System.out.println("Escolha o tipo de Combustível: ");
        System.out.println("Gasolina (1)");
        System.out.println(" Alcool  (2)");
        System.out.println(" Etanol  (3)");
        System.out.println(" Diesel  (4)");
        System.out.println("Biodisel (5)");
        System.out.println("Elétrico (6)");
        combustivel = ler.nextInt();

        System.out.println("Digite quantos Km/L ou kWh ele Gasta: ");
        System.out.println("Em trajeto Urbano");
        kmLU = ler.nextDouble();
        System.out.println("Em Rodovia");
        kmLR = ler.nextDouble();

        switch (combustivel) {
            case 1:
                valorC = 6.16;
                break;
            case 2:
                valorC = 4.29;
                break;
            case 3:
                valorC = 4.13;
                break;
            case 4:
                valorC = 6.06;
                break;
            case 5:
                valorC = 5.76;
                break;
            case 6:
                valorC = 2.00;
                break;
            default:
                System.out.println("Combustível invalido");
                break;
        }

        kmLUTotal = tanque * kmLU;

        kmLRTotal = tanque * kmLR;

        gastoCombusU = valorC * kmLUTotal;

        gastoCombusR = valorC * kmLRTotal;

        System.out.println();

    }
}

