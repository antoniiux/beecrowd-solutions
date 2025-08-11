package beecrowd;

import java.util.Scanner;

/*
    🔷 Problema Extra 001 — Positivo ou Negativo
    📄  Programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

public class CondicionalExtra001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO É NEGATIVO");
        }
        sc.close();
    }
}
