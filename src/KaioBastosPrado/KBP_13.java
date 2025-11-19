package KaioBastosPrado;

public class KBP_13 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos – RA: 0023338");
        System.out.println("Classe KBP_13 – Soma de 1 até 100");
        System.out.println("---------------------------------------------");

        // Programa
        int soma = 0;

        for (int i = 1; i <= 100; i++)
            soma += i;

        System.out.println("Soma total = " + soma);
    }
}
