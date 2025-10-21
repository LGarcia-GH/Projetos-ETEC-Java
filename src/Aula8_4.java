import java.util.Scanner;

public class Aula8_4 {
    public static void main(String[] args) throws Exception {

        // Aplicação de desconto

        Scanner ler = new Scanner(System.in);

        double valorCompra, desconto;

        System.out.println("Digite o valor da compra");
        valorCompra = ler.nextDouble();

        if (valorCompra < 0) {
            System.out.println("Você está devendo");
        } else if (valorCompra > 200) {
            desconto = (valorCompra * 0.20);
            valorCompra = (valorCompra - desconto);
            System.out.println(
                    "A compra terá o valor de R$:" + valorCompra + " o desconto de 20% teve o valor de R$:" + desconto);
        } else if (valorCompra < 100 && valorCompra >= 0) {
            System.out.println("A compra mantera o seu valor sem desconto que é de R$:" + valorCompra);
        } else {
            desconto = (valorCompra * 0.10);
            valorCompra = (valorCompra - desconto);
            System.out.println(
                    "A compra terá o valor de R$:" + valorCompra + " o desconto de 10% teve o valor de R$:" + desconto);
        }

    }

}