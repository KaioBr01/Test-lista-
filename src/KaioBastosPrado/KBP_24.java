package KaioBastosPrado;

import java.util.Scanner;

public class KBP_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_24 – Cálculo de potência");
        System.out.println("---------------------------------------------");

        System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Expoente: ");
        int exp = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= exp; i++)
            resultado *= base;

        System.out.println("Resultado = " + resultado);

        sc.close();
    }
}
