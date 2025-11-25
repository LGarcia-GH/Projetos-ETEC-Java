import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int cliente;
        double desconto, compra, valorFinal;

            System.out.println("Que tipo de cliente você é? ");
            System.out.println("Cliente Comum (1)");
            System.out.println("Cliente VIP   (2)");
            System.out.println("Funcionario   (3)");
            cliente = ler.nextInt();

            System.out.println("Digite o Valor da Compra: ");
            compra = ler.nextDouble();

            if (cliente == 1) {
                desconto = compra * 0.05;
                valorFinal = compra - desconto;
                System.out.println("Você é um cliente comum");
                System.out.println("Sua compra tem o valor de R$:" +valorFinal+ " Com um desconto de R$:" +desconto);
            } else if (cliente == 2) {
                desconto = compra * 0.10;
                valorFinal = compra - desconto;
                System.out.println("Você é um cliente VIP");
                System.out.println("Sua compra tem o valor de R$:" +valorFinal+ " Com um desconto de R$:" +desconto);
            } else if (cliente == 3) {
                desconto = compra * 0.20;
                valorFinal = compra - desconto;
                System.out.println("Você é um Funcionario");
                System.out.println("Sua compra tem o valor de R$:" +valorFinal+ " Com um desconto de R$:" +desconto);
            } else {
                System.out.println("Valor Digitado Invalido");
            }
    }
}

