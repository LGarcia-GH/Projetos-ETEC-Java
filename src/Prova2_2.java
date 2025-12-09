import java.util.Scanner;

public class Prova2_2 {
    public static void main(String[] args) throws Exception {

        //Tabuada

        Scanner ler = new Scanner(System.in);

        int tabuada = 1, numero, resultato;

       System.out.println("Digite o Número para Criar a Tabuada: ");
       numero = ler.nextInt();

       while (tabuada <= 10 && tabuada > 0) {
            resultato = numero * tabuada;
            
            System.out.println(numero + "X" + tabuada + " = " + resultato);
            
            tabuada += 1;
       }

    }
}

