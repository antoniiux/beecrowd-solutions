package beecrowd;

import java.util.Scanner;

/*
    🔷 Problema 1006 — Média 2
    📄 https://judge.beecrowd.com/pt/problems/view/1006

    📋 Enunciado:
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
    A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
    Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

    📋 Entrada:
    O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

    📋 Saída:
    Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
    Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

public class Problema1006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a * 2 +  b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f", media);
    }
}
