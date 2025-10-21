import java.util.Scanner;

public class Prova1_3 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double salarioBase, salarioFinal;
        int numeroSalarios;

        System.out.println("Ola este é o simulador de teto salarial");
        System.out.println("Digite o número de salarios-minimos (valor base de R$:1500):");
        numeroSalarios = ler.nextInt();

        salarioBase =  1500;
        salarioFinal = salarioBase * numeroSalarios;

        if ( salarioFinal > 5500) {
            System.out.println("Seu salario é da categoria acima do teto base da empresa com o valor de R$:" + salarioFinal);
        } else if ( salarioFinal >= 3000 && salarioFinal <= 5500 ) {
            System.out.println("Seu salario é da categoria dentro do teto base da empresa com o valor de R$:" + salarioFinal);
        } else if ( salarioFinal < 3000 && salarioFinal > 0) {
            System.out.println("Seu salario é da categoria abaixo do teto base da empresa com o valor de R$:" + salarioFinal);
        } else {
            System.out.println("Valor invalido");
        }

    }

}