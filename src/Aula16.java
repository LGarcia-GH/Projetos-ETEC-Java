import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int pedido, nPedido = 1;
        float soma = 0;

        System.out.println("------------------------------------------------");
        System.out.println("              Lanchonete do Tião");
        System.out.println("------------------------------------------------");
        System.out.println("Digite o Número do seu Pedido");
        System.out.println("1 - X-Salada     (R$: 15,00)");
        System.out.println("2 - X-Bacon      (R$: 18,00)");
        System.out.println("3 - Refrigerante (R$: 6,00)");
        System.out.println("4 - Suco         (R$: 8,00)");
        System.out.println("0 - Para Encerrar o Pedido");
        System.out.println("------------------------------------------------");
        System.out.println(+ nPedido +"° Pedido");
        pedido = ler.nextInt();

        if ( pedido > 5 )

        while (pedido != 0) {
            nPedido += 1;
            System.out.println(+ nPedido +"° Pedido");
            pedido = ler.nextInt();

            switch (pedido) {
                default:
                    System.out.println("Valor invalido o Programa será Encerrado");
                    break;
                case 1:
                    soma += 15.00;
                case 2:
                    soma += 18.00;
                case 3:
                    soma += 6.00;
                case 4:
                    soma += 8.00;
            }
        }

        System.out.println("O Total do Pedido foi R$:" + soma);


    }
}

