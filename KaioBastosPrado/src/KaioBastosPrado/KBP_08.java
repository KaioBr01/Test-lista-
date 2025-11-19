package KaioBastosPrado;

import java.util.Scanner;

public class KBP_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_08 – Login simples");
        System.out.println("---------------------------------------------");

        // Programa
        System.out.print("Usuário: ");
        String u = sc.next();

        System.out.print("Senha: ");
        String s = sc.next();

        if (u.equals("admin") && s.equals("123"))
            System.out.println("Login bem-sucedido!");
        else
            System.out.println("Usuário ou senha incorretos.");

        sc.close();
    }
}
