public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
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
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return  true;
        }
        return false;
    }
}
