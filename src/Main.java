public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("primeiro");
        vetor.adiciona("segundo");
        int tamanho = vetor.getTamanho();
        System.out.println(vetor);
    }
}