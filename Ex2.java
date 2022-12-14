package lista3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
         VOLUME=COMPRIMENTO * LARGURA * ALTURA.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento da caixa");
        float c = sc.nextFloat();

        System.out.println("Digite a largura da caixa");
        float l = sc.nextFloat();

        System.out.println("Digite a altura da caixa");
        float a = sc.nextFloat();

        float v = c * l * a;

        System.out.println("O volume da caixa retangular é: " + v + "m³");
        sc.close();

    }

}
