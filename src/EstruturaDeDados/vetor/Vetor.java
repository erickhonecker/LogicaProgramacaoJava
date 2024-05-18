package EstruturaDeDados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }


    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
          }
        return false;
        }



    /* Existe uma opção que melhor

        public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Vetor já está cheio, não cabe mais nada!");
        }
    }
*/

/*
 *  Metodo de adicionar elemento pouco eficiente,
 *  pois ele precisa percorrer o vetor completo
 *
    public void adiciona(String elemento){
        for (int i =0; i< this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    *
    * */
}
