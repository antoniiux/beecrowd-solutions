package beecrowd;

/*
    🔷 Problema 1018 — Cédulas
    📄 https://judge.beecrowd.com/pt/problems/view/1019
*/

import java.util.Scanner;

public class Problema1018 {
    public static void main(String[] args) {
        int valor = new Scanner(System.in).nextInt();
        int quantidadeDeNotas;
        int[] valoresDeNotas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int valorDaNota : valoresDeNotas) {
            quantidadeDeNotas = valor / valorDaNota;
            valor = valor - (quantidadeDeNotas * valorDaNota);
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeNotas, valorDaNota);
        }
    }
}
