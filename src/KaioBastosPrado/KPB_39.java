package KaioBastosPrado;

import java.util.Scanner;

public class KPB_39 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_39 – Número entre 1 e 5");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = sc.nextInt();

        } while (numero < 1 || numero > 5);

        System.out.println("Número válido: " + numero);

        sc.close();
    }

}
