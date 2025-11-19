package KaioBastosPrado;

import java.util.Scanner;

public class KBP_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_25 – Somar pares até digitar ímpar");
        System.out.println("---------------------------------------------");

        int num, soma = 0;

        do {
            System.out.print("Digite um número (ímpar encerra): ");
            num = sc.nextInt();

            if (num % 2 == 0)
                soma += num;

        } while (num % 2 == 0);

        System.out.println("Soma dos pares = " + soma);

        sc.close();
    }
}
