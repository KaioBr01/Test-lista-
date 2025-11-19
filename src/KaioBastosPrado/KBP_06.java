package KaioBastosPrado;

import java.util.Scanner;

public class KBP_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_06 – Múltiplo de 3 e/ou 5");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("O número é múltiplo de 3 E de 5.");
        } else if (n % 3 == 0) {
            System.out.println("O número é múltiplo de 3.");
        } else if (n % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número NÃO é múltiplo de 3 nem de 5.");
        }

        sc.close();
    }
}
