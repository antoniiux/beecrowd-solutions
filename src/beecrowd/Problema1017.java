package beecrowd;

/*
    🔷 Problema 1017 — Gasto de Combustível
    📄 https://judge.beecrowd.com/pt/problems/view/1017
*/

import java.util.Scanner;

public class Problema1017 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int tempoGastoNaViagem = sc.nextInt();
    int velocidadeMedia = sc.nextInt();
    double litrosNecessarios = (velocidadeMedia / 12f) * tempoGastoNaViagem;
        System.out.printf("%.3f\n", litrosNecessarios);
    }
}
