import java.util.Scanner;

public class Aula7_2 {
    public static void main(String[] args) throws Exception {

        // Desconto de produto

        Scanner ler = new Scanner(System.in);

        int quantidade;
        double preco, desconto, precoFinal;

        System.out.println("Quantos produtos você comprou?");
        quantidade = ler.nextInt();

        System.out.println("Quanto custou no total?");
        preco = ler.nextDouble();

        if (quantidade >= 20) {
            desconto = preco * 0.15;
            precoFinal = preco - desconto;
            System.out.println("Seus " + quantidade + " produtos estão com um desconto de 15% sendo " + desconto);
            System.out.println("O valor final será " + precoFinal);
        } else {
            desconto = preco * 0.05;
            precoFinal = preco - desconto;
            System.out.println("Seus " + quantidade + " produtos estão com um desconto de 5% sendo " + desconto);
            System.out.println("O valor final será " + precoFinal);
        }

    }

}
