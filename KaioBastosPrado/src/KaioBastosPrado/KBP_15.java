package KaioBastosPrado;

import java.util.Scanner;

public class KBP_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_15 – Fatorial");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++)
            fat *= i;

        System.out.println("Fatorial = " + fat);

        sc.close();
    }
}
