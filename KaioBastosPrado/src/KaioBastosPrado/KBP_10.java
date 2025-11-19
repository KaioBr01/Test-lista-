package KaioBastosPrado;

import java.util.Scanner;

public class KBP_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_10 – Ano bissexto");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
            System.out.println("Ano bissexto!");
        else
            System.out.println("Ano normal.");

        sc.close();
    }
}
