package KaioBastosPrado;

import java.util.Scanner;

public class KBP_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_21 – Média de idades");
        System.out.println("---------------------------------------------");

        int idade, soma = 0, qtd = 0;

        do {
            System.out.print("Digite uma idade (negativa encerra): ");
            idade = sc.nextInt();

            if (idade >= 0) {
                soma += idade;
                qtd++;
            }

        } while (idade >= 0);

        if (qtd > 0)
            System.out.println("Média das idades = " + (soma / (double) qtd));
        else
            System.out.println("Nenhuma idade válida.");

        sc.close();
    }
}
