package KaioBastosPrado;

import java.util.Scanner;

public class KBP_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: ______");
        System.out.println("Classe KBP_18 – Soma até digitar 0");
        System.out.println("---------------------------------------------");

        int num, soma = 0;

        do {
            System.out.print("Digite um número (0 encerra): ");
            num = sc.nextInt();
            soma += num;

        } while (num != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
