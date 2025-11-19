package KaioBastosPrado;

import java.util.Scanner;

public class KBP_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_02 – Par ou Ímpar");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("O número é PAR.");
        else
            System.out.println("O número é ÍMPAR.");

        sc.close();
    }
}
