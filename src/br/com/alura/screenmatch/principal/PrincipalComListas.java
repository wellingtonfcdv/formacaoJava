package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(8);

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(10);

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(9);

        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }



        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenados: " );
        Collections.sort(lista); //realiza a ordenaçã da lista
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenado por ano");
        System.out.println(lista);
    }
}
