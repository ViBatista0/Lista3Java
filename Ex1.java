package lista3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        /*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização
         do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas
          e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será
          necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de
           saída.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        int a = sc.nextInt();

        System.out.println("Digite outro valor");
        int b = sc.nextInt();

        System.out.println("Digite mais um valor");
        int c = sc.nextInt();

        System.out.println("Digite um último valor");
        int d = sc.nextInt();

        System.out.println("\nSoma: " + a + " + " + b + " = " + (a+b));
        System.out.println("Multiplicação: " + a + " * " + b + " = " + (a*b));

        System.out.println("\nSoma: " + a + " + " + c + " = " + (a+c));
        System.out.println("Multiplicação: " + a + " * " + c + " = " + (a*c));

        System.out.println("\nSoma: " + a + " + " + d + " = " + (a+d));
        System.out.println("Multiplicação: " + a + " * " + d + " = " + (a*d));

        System.out.println("\nSoma: " + b + " + " + c + " = " + (b+c));
        System.out.println("Multiplicação: " + b + " * " + c + " = " + (b*c));

        System.out.println("\nSoma: " + b + " + " + d + " = " + (b+d));
        System.out.println("Multiplicação: " + b + " * " + d + " = " + (b*d));

        System.out.println("\nSoma: " + c + " + " + d + " = " + (c+d));
        System.out.println("Multiplicação: " + c + " * " + d + " = " + (c*d));

        sc.close();
    }
}
