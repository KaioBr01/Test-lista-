package KaioBastosPrado;

import java.util.Scanner;

public class KBP_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_20 – Contar números pares");
        System.out.println("---------------------------------------------");

        int num, pares = 0;

        do {
            System.out.print("Digite um número (0 encerra): ");
            num = sc.nextInt();

            if (num != 0 && num % 2 == 0)
                pares++;

        } while (num != 0);

        System.out.println("Quantidade de pares digitados = " + pares);

        sc.close();
    }
}
