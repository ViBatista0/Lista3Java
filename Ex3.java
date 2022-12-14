package lista3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){

        /*3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor
        pelo segundo.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int b = sc.nextInt();

        float res = a - b;

        res = res * res;

        System.out.println("O quadrado da diferença dos números lidos é: " + res);
        sc.close();


    }

}
