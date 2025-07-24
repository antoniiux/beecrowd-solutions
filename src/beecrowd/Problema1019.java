package beecrowd;

import java.util.Scanner;
/*
    🔷 Problema 1019 — Conversão de Tempo
    📄 https://judge.beecrowd.com/pt/problems/view/1019

    📋 Enunciado:
    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
    e informe-o expresso no formato horas:minutos:segundos.

    📋 Entrada:
    O arquivo de entrada contém um valor inteiro N.

    📋 Saída:
    Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

public class Problema1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int horas = n / 3600;
        int minutos = (n % 3600) / 60;
        int segundos  = n % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}

