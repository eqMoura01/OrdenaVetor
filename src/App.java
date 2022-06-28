import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaracao da variavel vet como vetor de inteiro.
        int vet[];
        // Inicializacao da variavel vet e alocacao de espaço para o vetor.
        vet = new int[4];
        // Declaracao das variaveis i, j e aux como inteiro.
        int i, aux, j;

        // Laco for para percorrer o vetor em todas as suas posicoes e salvar um inteiro
        // em cada posicao.
        for (i = 0; i < 4; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero"));
            System.out.println(vet[i]);
        }

        // Segundo laco for para percorrer todas as posicoes do vetor
        for (i = 0; i < 5; i++) {
            // Terceiro laco for para percorrer as 3 primeiras posicoes do vetor. Nao ha
            // necessidade de verificar a ultima casa pois com certeza ela estara em ordem.
            for (j = i + 1; j < 4; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        System.out.println("-------------------");

        for (i = 0; i < 4; i++) {
            // Imprime no console todas as posicoes do vetor para a verificacao da ordem
            // correta do vetor.
            System.out.println(vet[i]);
        }

    }
}
