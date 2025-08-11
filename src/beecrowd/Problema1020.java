package beecrowd;

/*
    🔷 Problema 1020 — Idade em Dias
    📄 https://judge.beecrowd.com/pt/problems/view/1020
*/

import java.util.Scanner;

public class Problema1020 {
    public static void main(String[] args) {

        int valor = new Scanner(System.in).nextInt();

        int anos = valor / 365;
        valor = valor - (365 * anos);

        int meses = valor / 30;
        valor = valor - (30 * meses);

        int dias = valor;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
    }
}

