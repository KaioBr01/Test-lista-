package KaioBastosPrado;

import java.util.Scanner;

public class KBP_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_23 – Maior de 10 números");
        System.out.println("---------------------------------------------");

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num > maior)
                maior = num;
        }

        System.out.println("Maior número = " + maior);

        sc.close();
    }
}
