package KaioBastosPrado;

import java.util.Scanner;

public class KBP_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_05 – Notas e aprovação");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite a nota: ");
        double n = sc.nextDouble();

        if (n >= 6)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado.");

        sc.close();
    }
}
