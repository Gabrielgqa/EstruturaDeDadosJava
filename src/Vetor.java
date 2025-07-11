import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho(){
        return tamanho;
    }

    /*public void adiciona(String elemento){
        for (int i = 0; i < elementos.length; i++){
            if(elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(String elemento) throws Exception{
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }*/

    public boolean adiciona(String elemento){
        aumentaCapacidade();
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return  true;
        }
        return false;
    }

    public boolean adiciona(String elemento, int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentaCapacidade();
        for(int i=tamanho; i>=posicao; i--){
            if(i == posicao){
                elementos[posicao] = elemento;
                tamanho++;
                return true;
            } else {
                elementos[i] = elementos[i-1];
            }
        }
        return false;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            String [] elementosNovos = new String[elementos.length * 2];
            for (int i=0; i < tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
             throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int busca(String elemento){
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i<tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }
        if(tamanho > 0){
            s.append(elementos[tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
}
