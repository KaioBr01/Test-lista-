package KaioBastosPrado;

import java.util.Scanner;

public class KPB_40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_40 – Maior número até digitar negativo");
        System.out.println("---------------------------------------------");

        int numero;
        int maior = Integer.MIN_VALUE;

        do {
            System.out.print("Digite um número (negativo para parar): ");
            numero = sc.nextInt();

            if (numero >= 0 && numero > maior) {
                maior = numero;
            }

        } while (numero >= 0);

        System.out.println("Maior número digitado: " + maior);

        sc.close();
    }
}
