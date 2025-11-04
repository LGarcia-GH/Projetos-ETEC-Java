import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int opcao;

        System.out.println("Selecione uma opção abaixo no menu:");
        System.out.println("1- X-Salada R$:15,00");
        System.out.println("2- X-Bacon R$:18,00");
        System.out.println("3- Refrigerante R$:6,00");
        System.out.println("4- Suco R$:8,00");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Pedido Computado");
                System.out.println("1- X-Salada R$:15,00");
                break;
            case 2:
                System.out.println("Pedido Computado");
                System.out.println("2- X-Bacon R$:18,00");
                break;
            case 3:
                System.out.println("Pedido Computado");
                System.out.println("3- Refrigerante R$:6,00");
                break;
            case 4:
                System.out.println("Pedido Computado");
                System.out.println("4- Suco R$:8,00");
                break;
            default:
                System.out.println("Seu animal de teta, digitou errado >:(");
                break;                  

        }

    }

}
