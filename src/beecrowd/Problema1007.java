package beecrowd;

import java.util.Scanner;

/*
    🔷 Problema 1007 — Diferença
    📄 https://judge.beecrowd.com/pt/problems/view/1007

    📋 Enunciado:
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    📋 Entrada:
    O arquivo de entrada contém 4 valores inteiros.

    📋 Saída:
    Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

public class Problema1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = (a * b - c * d);

        System.out.println("Diferença = " + diferenca);
    }
}
