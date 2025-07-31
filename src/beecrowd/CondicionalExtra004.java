package beecrowd;

import java.util.Scanner;

/*
    🔷 Problema Extra 004 — Multiplos ou não
    📄 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
       começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

public class CondicionalExtra004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao = 0;

        if (horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
