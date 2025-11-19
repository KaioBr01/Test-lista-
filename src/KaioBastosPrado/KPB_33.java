package KaioBastosPrado;

import java.util.Scanner;

public class KPB_33 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_33 – Menu com Do-While");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            }

        } while (opcao != 2);

        System.out.println("Programa encerrado.");

        sc.close();
    }

}
