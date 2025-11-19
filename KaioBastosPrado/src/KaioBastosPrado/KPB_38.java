package KaioBastosPrado;

import java.util.Scanner;

public class KPB_38 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_38 – Sair com confirmação");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        char sair;

        do {
            System.out.print("Deseja sair? (s/n): ");
            sair = sc.next().toLowerCase().charAt(0);

        } while (sair != 's');

        System.out.println("Programa encerrado.");

        sc.close();
    }

}
