package KaioBastosPrado;

import java.util.Scanner;

public class KBP_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_01 – Número positivo ou negativo");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (n < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }

        sc.close();
    }
}
