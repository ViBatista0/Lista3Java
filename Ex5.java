package lista3;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){

        /*5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
        O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário,
        para que seja apresentado o valor em moeda americana.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dolar: ");
        float dollar = sc.nextFloat();

        System.out.println("Digite quantos reais você possui: ");
        int qtdReal = sc.nextInt();

        float res = qtdReal / dollar;

        System.out.println("A conversão em dolar equivale a: $" + res);


        sc.close();


    }

}
