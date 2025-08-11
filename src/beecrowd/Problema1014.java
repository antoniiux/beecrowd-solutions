package beecrowd;

/*
    🔷 Problema 1014 — Consumo
    📄 https://judge.beecrowd.com/pt/problems/view/1014
*/

import java.util.Scanner;

public class Problema1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double totalDeCombustivelGasto = sc.nextFloat();
        double consumoMedio = distanciaTotal / totalDeCombustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}