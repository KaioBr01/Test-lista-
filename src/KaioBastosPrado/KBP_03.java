package KaioBastosPrado;

import java.util.Scanner;

public class KBP_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_03 – Maior de dois números");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("O maior é: " + a);
        else if (b > a)
            System.out.println("O maior é: " + b);
        else
            System.out.println("Os números são iguais.");

        sc.close();
    }
}
