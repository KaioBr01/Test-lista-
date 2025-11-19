package KaioBastosPrado;

public class KPB_28 {

    public static void main(String[] args) {

        // Cabeçalho obrigatório
        System.out.println("Aluno: Kaio Bastos Prado – RA: 0023338 – KBP");

        int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("Soma dos pares = " + soma);
    }

}
