package KaioBastosPrado;

import java.util.Scanner;

public class KBP_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_07 – Triângulo válido");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Digite o lado A: ");
        int a = sc.nextInt();

        System.out.print("Digite o lado B: ");
        int b = sc.nextInt();

        System.out.print("Digite o lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triângulo válido!");
        } else {
            System.out.println("NÃO forma um triângulo.");
        }

        sc.close();
    }
}
