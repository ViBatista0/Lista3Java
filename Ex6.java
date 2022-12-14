package lista3;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args){

        /*6) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
        soma dos quadrados dos três valores lidos.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float a = sc.nextFloat();

        System.out.println("Digite outro valor: ");
        float b = sc.nextFloat();

        System.out.println("Digite mais um valor: ");
        float c = sc.nextFloat();

        float res = (a*a)+(b*b)+(c*c);

        System.out.println("O quadrado da soma dos valores equivale a: " + res);

        sc.close();

    }

}
