//A Classe irá especificar o que o filme tem
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return  totalDeAvaliacoes;
    }

    // Se o método não retorna nada, deve definir como void

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacao / totalDeAvaliacoes;
    }

}
