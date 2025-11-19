package KaioBastosPrado;

import java.util.Scanner;

public class KBP_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_19 – Média de 5 números");
        System.out.println("---------------------------------------------");

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += sc.nextInt();
        }

        System.out.println("Média = " + (soma / 5.0));

        sc.close();
    }
}
