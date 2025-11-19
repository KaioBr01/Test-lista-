package KaioBastosPrado;

import java.util.Scanner;

public class KPB_32 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe JPA32 – Tabuada com Do-While");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int i = 1;

        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);

        sc.close();
    }

}
