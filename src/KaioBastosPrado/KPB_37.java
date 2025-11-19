package KaioBastosPrado;

import java.util.Scanner;

public class KPB_37 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_37 – Soma até múltiplo de 10");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;

        } while (numero % 10 != 0);

        System.out.println("Soma total = " + soma);

        sc.close();
    }

}

