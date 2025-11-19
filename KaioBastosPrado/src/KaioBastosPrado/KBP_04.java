package KaioBastosPrado;

import java.util.Scanner;

public class KBP_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_04 – Pode votar?");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 16)
            System.out.println("Pode votar.");
        else
            System.out.println("Não pode votar.");

        sc.close();
    }
}
