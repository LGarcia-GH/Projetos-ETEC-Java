import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        String nome;
        int telefone;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite seu Telefone: ");
        telefone = leitura.nextInt();
        
        //Concatenação em java serve para unir uma mensagem com o valor de uma variavel

        System.out.println("O nome é: " + nome + " e o telefone é: " + telefone);
    }
}
