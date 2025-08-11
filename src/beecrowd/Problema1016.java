package beecrowd;

/*
    🔷 Problema 1016 — Distância
    📄 https://judge.beecrowd.com/pt/problems/view/1016
*/

import java.util.Scanner;

public class Problema1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciaDeKm = sc.nextInt();
        int tempoNecessario = distanciaDeKm * 2;

        System.out.printf("%d minutos\n", tempoNecessario);
    }
}
