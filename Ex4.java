package lista3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){

        /*4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
         O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o
         usuário, para que seja apresentado o valor em moeda brasileira.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dolar: ");
        float dollar = sc.nextFloat();

        System.out.println("Digite quantos dolares você possui: ");
        int qtdDoll = sc.nextInt();

        float real = dollar * qtdDoll;

        System.out.println("A conversão em reais equivale a: R$" + real);

        sc.close();

    }

}
