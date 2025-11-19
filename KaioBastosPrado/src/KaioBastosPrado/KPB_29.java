package KaioBastosPrado;

import java.util.Scanner;

public class KPB_29 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int n = sc.nextInt();

        int cont = 0;

        while (n > 0) {
            n /= 10;
            cont++;
        }

        System.out.println("Quantidade de dígitos: " + cont);

        sc.close();
    }

}
