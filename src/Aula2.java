import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) throws Exception {

        Scanner Leitura = new Scanner(System.in);

        String nome;
        int idade,novaIdade;

        System.out.println("Digite seu nome");
        nome = Leitura.nextLine();
      
        System.out.println("Digite sua idade");
        idade = Leitura.nextInt();

        System.out.println("O seu nome é: "+nome+" e a sua idade é essa "+idade);

        novaIdade = idade+1;

        System.out.println("Sua idade no ano proximo ano será "+novaIdade);

    }
}

