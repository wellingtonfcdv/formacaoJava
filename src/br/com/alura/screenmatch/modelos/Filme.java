package br.com.alura.screenmatch.modelos;

//A Classe irá especificar o que o filme tem
public class Filme  extends Titulo{

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
