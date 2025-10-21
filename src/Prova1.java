import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double renda;

        System.out.println("Ola esse é o simulador de emprestimos");
        System.out.println("Digite sua renda:");
        renda = ler.nextDouble();

        if (renda <= 0) {
            System.out.println("Valor digitado invalido");
        } else if (renda <= 3999 && renda > 0) {
            System.out.println("Você pode fazer um emprestimo de até R$:5000");
        } else if (renda >= 4000 && renda <= 7999) {
            System.out.println("Você pode fazer um emprestimo de até R$:10000");
        } else {
            System.out.println("Você pode fazer um emprestimo de até R$:20000");
        }

    }

}
