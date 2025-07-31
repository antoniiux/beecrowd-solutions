package beecrowd;

import java.util.Scanner;

/*
    🔷 Problema Extra 002 — Impar ou Par
    📄 Programa para ler um número inteiro, e depois dizer se este número é negativo ou não
*/

public class CondicionalExtra002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
