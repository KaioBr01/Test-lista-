package KaioBastosPrado;

import java.util.Scanner;

public class KPB_27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");

        int numero, impares = 0, contador = 1;

        while (contador <= 10) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 2 != 0) {
                impares++;
            }

            contador++;
        }

        System.out.println("Quantidade de ímpares: " + impares);

        sc.close();
    }

}
