package beecrowd;

/*
    🔷 Problema 1035 — Teste de Seleção 1
    📄 https://judge.beecrowd.com/pt/problems/view/1035
*/


import java.util.Scanner;

public class Problema1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((b > c) && (d > a) && (c + d) > (a + b) && (c > 0) && (d > 0) && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}