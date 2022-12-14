package lista3;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args){

        /*7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o
        quadrado da soma dos três valores lidos.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float a = sc.nextFloat();

        System.out.println("Digite outro valor: ");
        float b = sc.nextFloat();

        System.out.println("Digite mais um valor: ");
        float c = sc.nextFloat();

        float res = a+b+c;
        res = res * res;

        System.out.println("O quadrado da soma dos valores equivale a: " + res);

        sc.close();


    }

}
