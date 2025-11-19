package KaioBastosPrado;

import java.util.Scanner;

public class KBP_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_12 – Tabuada (for)");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));

        sc.close();
    }
}
