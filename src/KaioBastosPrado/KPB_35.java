package KaioBastosPrado;

import java.util.Scanner;

public class KPB_35 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_35 – Número positivo com Do-While");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Número aceito: " + n);

        sc.close();
    }

}
