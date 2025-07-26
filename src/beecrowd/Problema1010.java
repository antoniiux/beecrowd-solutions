package beecrowd;

import java.util.Scanner;
/*
    🔷 Problema 1010 — Cálculo Simples
    📄 https://judge.beecrowd.com/pt/problems/view/1010

    📋 Enunciado:
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
     o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

    📋 Entrada:
    O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

    📋 Saída:
    A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os
    dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/

public class Problema1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double vlr1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double vlr2 = sc.nextDouble();

        double valorApagar = (qtd1 * vlr1) + (qtd2 * vlr2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorApagar);
    }
}
