package KaioBastosPrado;

import java.util.Scanner;

public class KPB_34 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");
        System.out.println("Classe KPB_34 – Senha com Do-While");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);

        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha != 1111);

        System.out.println("Acesso liberado!");

        sc.close();
    }

}
