package beecrowd;

import java.util.Locale;
import java.util.Scanner;

/*
    🔷 Problema 1002 — Área do Círculo
    📄 https://judge.beecrowd.com/pt/problems/view/1002

    📋 Enunciado:
    Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo.
    Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá
    "Presentation Error".

    📋 Entrada:
    A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

    📋 Saída:
    Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
    Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
    caso contrário, você receberá "Presentation Error".

*/

public class Problema1002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = n * raio * raio;

        Locale.setDefault(Locale.US);
        System.out.printf("A=%.4f\n", area);
    }
}
