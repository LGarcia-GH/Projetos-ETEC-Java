import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) throws Exception {

        String nome;
        int nota1,nota2,nota3,nota4,media;
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite seu nome ");
        nome = leitura.nextLine();

        System.out.println("Primeira nota ");
        nota1 = leitura.nextInt();

        System.out.println("Segunda nota ");
        nota2 = leitura.nextInt();

        System.out.println("Terceira nota ");
        nota3 = leitura.nextInt();

        System.out.println("Quarta nota ");
        nota4 = leitura.nextInt();

        media = nota1+nota2+nota3+nota4;

        System.out.println("A média das notas de "+nome+" é está "+media/4);

    }

}
