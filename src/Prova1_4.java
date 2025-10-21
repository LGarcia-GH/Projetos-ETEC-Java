import java.util.Scanner;

public class Prova1_4 {
    public static void main(String[] args) throws Exception {

         Scanner ler=new Scanner(System.in);

        Double Resultado, numero1, numero2,calculadora;
         
        System.out.println("Digite o primeiro numero");
        numero1 = ler.nextDouble();

        System.out.println("Digite o calculo:+(1),-(2),*(3),/(4)");
        calculadora = ler.nextDouble();

        System.out.println("Digite o segundo numero");
        numero2= ler.nextDouble();

        if(calculadora == 1){
            Resultado = numero1 + numero2;
            System.out.println("O resultado é " + Resultado);
        }else if(calculadora ==2){
            Resultado = numero1 - numero2;
            System.out.println("O resultado é " + Resultado);
        }else if(calculadora ==3){
            Resultado = numero1 * numero2;
            System.out.println(" O resultado é " + Resultado);
        }else if(calculadora ==4){
            Resultado = numero1 / numero2;
            System.out.println("O resultado é " + Resultado);
        } else {
            System.out.println("Operador invalido");
        }

    }

}