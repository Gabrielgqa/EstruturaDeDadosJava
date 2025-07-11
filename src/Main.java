public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.adiciona("primeiro");
        vetor.adiciona("segundo");
        int tamanho = vetor.getTamanho();
        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca("primeiro"));
        System.out.println(vetor.adiciona("primeirissimo", 0));
        vetor.remove(1);
        System.out.println(vetor);
    }
}