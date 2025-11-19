package KaioBastosPrado;

import java.util.Arrays;
import java.util.Scanner;

public class KBP_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_09 – Ordem crescente (3 números)");
        System.out.println("---------------------------------------------");

        // Programa
        int[] v = new int[3];

        System.out.print("Digite o 1º número: ");
        v[0] = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        v[1] = sc.nextInt();

        System.out.print("Digite o 3º número: ");
        v[2] = sc.nextInt();

        Arrays.sort(v);

        System.out.println("Ordem crescente:");
        System.out.println(v[0] + " - " + v[1] + " - " + v[2]);

        sc.close();
    }
}
