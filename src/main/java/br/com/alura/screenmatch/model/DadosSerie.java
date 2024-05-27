package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Mapeamento do que vai ser pego no JSON
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {

    //Json Alias x Json Property
    //JsonProperty = serve tanto no processo de serialização quanto no processo de serialização.
    //Ele tenta ler e escreve o nome do "Apelido" que adiconamos entre (""). Se o que ta escrito no JSON é "Title", ele vai escrever "Title".
    //Já o JsonAlias não, ele vai ler o que adicionamos como ("") e vai add o que tá como declarado nos parâmetros (titulo)
}
